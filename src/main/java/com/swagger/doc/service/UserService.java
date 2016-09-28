package com.swagger.doc.service;

import com.swagger.doc.po.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by haoyifen on 16-9-28 2016 下午5:59
 */
@Service("userService")
public class UserService {
    private static final Log LOGGER = LogFactory.getLog(UserService.class);

    private static List<User> allUsers = new ArrayList<User>();

    static {
        User user = null;
        for (int i = 0; i < 2; i++) {
            user = new User(i, "user" + i, i * 10);
            allUsers.add(user);
        }
    }


    public int addUser(User user) {
        allUsers.add(user);
        return 1;
    }


    public int deleteUser(int id) {
        allUsers.set(id, null);
        return 0;
    }


    public int updateUser(int id, User user) {
        allUsers.set(id, user);
        return 0;
    }

    public User queryUserById(int id) {
        User user = allUsers.get(id);
        return user;
    }
}

