package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
    String name;
    String lastName;
    String email;
    String sex;
    int id;
    List<User> followings = new ArrayList<>();
    List<Posts> posts = new ArrayList<>();
    List<Integer> blockList = new ArrayList<>();
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