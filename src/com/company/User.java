package com.company;

import java.util.HashMap;

public class User {
    String name;
    String lastName;
    String email;
    String sex;
    int id;
    SyrrayList<User> followings = new SyrrayList<>();
    SyrrayList<Posts> posts = new SyrrayList<>();
    SyrrayList<Integer> blockList = new SyrrayList<>();
    //HashMap<User, Boolean> status = new HashMap<>();
    public User(int id, String name, String lastName, String email, String sex){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}