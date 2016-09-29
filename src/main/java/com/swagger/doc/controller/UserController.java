package com.swagger.doc.controller;

import com.swagger.doc.po.User;
import com.swagger.doc.service.UserService;
import com.swagger.doc.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by haoyifen on 16-9-28 2016 下午5:47
 */
@Api(value = "user")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    // @ResponseBody
    // @RequestMapping(value = "addUser", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    // @ApiOperation(value = "添加新用户", httpMethod = "POST", response = Result.class, notes = "add new user")
    // public String addUser(@ApiParam(required = true, name = "postData", value = "用户信息json数据") @RequestParam(
    //         value = "postData") String postData, HttpServletRequest request) {
    //     if (null == postData || postData.isEmpty()) {
    //         return super.buildFailedResultInfo(-1, "post data is empty!");
    //     }
    //
    //     UserInfo user = JSON.parseObject(postData, UserInfo.class);
    //     int result = userService.addUser(user);
    //     return buildSuccessResultInfo(result);
    // }

    // @ResponseBody
    // @RequestMapping(
    //         value = "queryUserById", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    // @ApiOperation(value = "根据用户ID查询用户信息")
    // public String queryUserById(@ApiParam(required = true, name = "userId", value = "user id") @RequestParam(
    //         value = "userId") String userId, HttpServletRequest request) {
    //     UserInfo info = userService.queryUserById(Integer.parseInt(userId));
    //
    //     return buildSuccessResultInfo(info);
    // }

    @ResponseBody
    @RequestMapping(value = "queryUserById", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/json")
    public Result queryUserById(@ApiParam(required = true, name = "userId") @RequestParam("userId") int userId, HttpServletRequest request) {
        User user = userService.queryUserById(userId);
        Result result = new Result();
        result.setCode(0);
        result.setData(user);
        result.setMessage("success");
        return result;
    }
}
