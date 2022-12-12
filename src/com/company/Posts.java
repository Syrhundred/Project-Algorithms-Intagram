package com.company;

public class Posts {
    String posts;
    SyrrayList<String> comments;
    int likes;

    public Posts(String posts, int likes, SyrrayList<String> comments){
        this.posts = posts;
        this.likes = likes;
        this.comments = new SyrrayList<>();
    }

    public void addComment(String comment){
        comments.add(Main.user.name + " " + Main.user.lastName + ": " + comment + '\n');
    }

    public String getComments(){
        StringBuilder commentsB = new StringBuilder();
        for (int i = 0; i < comments.size(); i++) {
            commentsB.append(comments.get(i));
        }
        return commentsB.toString();
    }
}