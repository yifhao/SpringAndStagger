package com.swagger.doc.controller;

import com.swagger.doc.po.User;
import com.swagger.doc.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by haoyifen on 16-9-28 2016 下午5:47
 */
@Api(value = "User控制器")
@Controller
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = Result.class)
    @ResponseBody
    @RequestMapping(value = "queryUserById", method = RequestMethod.GET, produces = "application/json")
    public Result queryUserById(@ApiParam(name = "userId", required = true, value = "用户Id") @RequestParam("userId") int userId, HttpServletRequest request) {
        User user = new User(userId, "haoyifen", 24);
        Result result = new Result();
        result.setCode(0);
        result.setData(user);
        result.setMessage("success");
        return result;
    }
}
