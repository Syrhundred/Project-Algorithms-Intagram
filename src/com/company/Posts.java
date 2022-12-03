package com.company;

import java.util.List;

public class Posts {
    String posts;
    String comments;
    int likes;

    public Posts(String posts, int likes, String comments){
        this.posts = posts;
        this.likes = likes;
        this.comments = comments;
    }
}