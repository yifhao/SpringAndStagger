package com.swagger.doc.po;

/**
 * Created by haoyifen on 16-9-28 2016 下午5:53
 */
public class User {
    private int userId;
    private String name;
    private int age;

    public User() {
    }

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public User setUserId(int userId) {
        this.userId = userId;
        return this;
    }
}
