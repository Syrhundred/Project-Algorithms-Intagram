package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Posts {
    String posts;
    HashMap<Posts, String> comments;
    int likes;

    public Posts(String posts, int likes, HashMap<Posts, String> comments){
        this.posts = posts;
        this.likes = likes;
        this.comments = comments;
    }
}