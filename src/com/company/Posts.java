package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Posts {
    String posts;
    ArrayList<String> comments;
    int likes;

    public Posts(String posts, int likes, ArrayList<String> comments){
        this.posts = posts;
        this.likes = likes;
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment){
        comments.add(Main.user.name + " " + Main.user.lastName + ": " + comment + '\n');
    }

    public String getComments(){
        StringBuilder commentsB = new StringBuilder();
        for (String comment : comments) {
            commentsB.append(comment);
        }
        return commentsB.toString();
    }
}