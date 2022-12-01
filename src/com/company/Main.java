package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static User user;
    static HashMap<String, User> data = new HashMap<>();
    static HashMap<Integer, User> allUsers = new HashMap<>();
    static ArrayList<Integer> ids = new ArrayList<>();
    static String[] pic = pic = new String[] {
                    "┈┈╭━╱▔▔▔▔╲━╮┈┈┈\n" +
                    "┈┈╰╱╭▅╮╭▅╮╲╯┈┈┈\n" +
                    "╳┈┈▏╰┈▅▅┈╯▕┈┈┈┈\n" +
                    "┈┈┈╲┈╰━━╯┈╱┈┈╳┈\n" +
                    "┈┈┈╱╱▔╲╱▔╲╲┈┈┈┈\n" +
                    "┈╭━╮▔▏┊┊▕▔╭━╮┈╳\n" +
                    "┈┃┊┣▔╲┊┊╱▔┫┊┃┈┈\n" +
                    "┈╰━━━━╲╱━━━━╯┈╳",

            "╭━━━╮┈┈╱╲┈┈┈╱╲\n" +
                    "┃╭━━╯┈┈▏▔▔▔▔▔▕\n" +
                    "┃╰━━━━━▏╭▆┊╭▆▕\n" +
                    "╰┫╯╯╯╯╯▏╰╯▼╰╯▕\n" +
                    "┈┃╯╯╯╯╯▏╰━┻━╯▕\n" +
                    "┈╰┓┏┳━┓┏┳┳━━━╯\n" +
                    "┈┈┃┃┃┈┃┃┃┃┈┈┈┈\n" +
                    "┈┈┗┻┛┈┗┛┗┛┈┈┈┈",

            "┊┊┊╱▔▔▔▔▔╲┊┊┊┊┊\n" +
                    "┊┊╱┈┈╱▔╲╲╲▏┊┊┊┊\n" +
                    "┊╱┈╭━━╱▔▔▔▔╲━━╮\n" +
                    "┊▏┈┃▔▔▏╭▅╭▅▕▔▔┃\n" +
                    "┊▏┈╰━╱┈╭┳┳╮┳╲━╯\n" +
                    "┊╲┈┈╲▏╭━━━━╯▕┊┊\n" +
                    "┊╲┈┈╲▂▂▂▂▂▂╱▔╲",

            "┈┈╱▔▔▔▔▔▔▔▔▔▔▔▏\n" +
                    "┈╱╭▏╮╭┻┻╮╭┻┻╮╭▏\n" +
                    "▕╮╰▏╯┃╭╮┃┃╭╮┃╰▏\n" +
                    "▕╯┈▏┈┗┻┻┛┗┻┻┻╮▏\n" +
                    "▕╭╮▏╮┈┈┈┈┏━━━╯▏\n" +
                    "▕╰╯▏╯╰┳┳┳┳┳┳╯╭▏\n" +
                    "▕┈╭▏╭╮┃┗┛┗┛┃┈╰▏\n" +
                    "▕┈╰▏╰╯╰━━━━╯┈┈▏",

            "▕▔╲┊┊┊┊┊┊┊┊┊╱▔▏\n" +
                    "┊╲┈╲╱▔▔▔▔▔╲╱┈╱\n" +
                    "┊┊╲┈╭╮┈┈┈╭╮┈╱┊\n" +
                    "┊┊╱┈╰╯┈▂┈╰╯┈╲┊\n" +
                    "┊┊▏╭╮▕━┻━▏╭╮▕┊\n" +
                    "┊┊╲╰╯┈╲▂╱┈╰╯╱┊"
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> menu;
        ArrayList<String> menu2 = new ArrayList<>();
        menu2.add("Registration");
        menu2.add("Log In");
        menu2.add("unsubscribing from another user");
        menu2.add("subscribing to another user");
        menu2.add("commenting posts of another user");
        menu2.add("making posts on your profile");
        menu2.add("liking posts");
        menu2.add("blocking users");
        menu2.add("removing a user from a blocked list");
        menu2.add("getting k posts with a maximum number of likes");
        menu2.add("sorting posts by number of likes");
        menu2.add("checking how many likes a post has");
        menu2.add("checking which your subscriber has the highest number of common subscribers");

        menu = menu2;

        while (true) {
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(i + 1 + ") " + menu.get(i));
            }
            System.out.println();

            int choice = in.nextInt();

            switch (menu.get(choice - 1)) {
                case "Registration" -> {
                    registration();
                }
                case "Log In" -> {
                    logging(menu);
                }
                case "Log Out" -> {
                    menu2 = new ArrayList<>();
                    menu2.add("Registration");
                    menu2.add("Log In");
                    menu2.add("unsubscribing from another user");
                    menu2.add("subscribing to another user");
                    menu2.add("commenting posts of another user");
                    menu2.add("making posts on your profile");
                    menu2.add("liking posts");
                    menu2.add("blocking users");
                    menu2.add("removing a user from a blocked list");
                    menu2.add("getting k posts with a maximum number of likes");
                    menu2.add("sorting posts by number of likes");
                    menu2.add("checking how many likes a post has");
                    menu2.add("checking which your subscriber has the highest number of common subscribers");
                    menu = menu2;
                    user = null;
                }
                case "unsubscribing from another user" -> {
                    unsubscribe();
                }

                case "subscribing to another user" -> {
                    subscribe();
                }
                case "making posts on your profile" -> {
                    addPosts();
                }
                case "liking posts" -> {
                    likingPosts();
                }
                case "blocking users" -> {
                    for (int i = 0; i < allUsers.size(); i++) {
                        System.out.println(allUsers.get(ids.get(i)).name);
                    }
                }
            }
        }
    }

    public static void registration() {
        System.out.print("Enter your Name: ");
        String name = in.next();
        System.out.print("Enter your last name: ");
        String lastName = in.next();
        System.out.print("Your email: ");
        String email = in.next();
        System.out.print("Male or Female: ");
        String sex = in.next();
        int id = (int) (Math.random() * 6);
        User temp;

        while (true) {
            if (!allUsers.containsKey(id)) {
                if (!data.containsKey(email) && email.contains("@")) {
                    temp = new User(id, name, lastName, email, sex);
                    data.put(email, temp);
                    ids.add(id);
                    allUsers.put(id, temp);
                    System.out.println("\nCongratulations! You are registered now.");
                } else {
                    System.out.println("\nDon't valid email !\n");
                }
                break;
            } else {
                id = (int) (Math.random() * 6);
            }
        }
    }

    public static void logging(ArrayList<String> menu) {
        System.out.print("Please enter your email for checking: ");
        String email = in.next();
        user = data.get(email);

        if (user == null) {
            System.out.println("Your email is incorrect");
        } else {
            menu.remove(0);
            menu.remove(0);
            menu.add("Log Out");
            System.out.println("Hi, " + user.name + " !");
        }
    }

    public static void subscribe() {
        if(allUsers.size() > 1) {
            System.out.println("-------Users-------");
            for (int i = 0; i < allUsers.size(); i++) {
                if (allUsers.get(ids.get(i)) != user && !user.followings.contains(allUsers.get(ids.get(i)))) {
                    System.out.println(allUsers.get(ids.get(i)).id + " " + allUsers.get(ids.get(i)).name + " " + allUsers.get(ids.get(i)).lastName);
                }
            }
            System.out.println("-------------------");
            System.out.print("\nPlease, write here ID of the \nPerson you want to subscribe: ");

            int choice = in.nextInt();
            if (allUsers.containsKey(choice) && !user.followings.contains(allUsers.get(choice))) {
                user.followings.add(allUsers.get(choice));
                System.out.println("\nYou followed succesfully !\n");
            } else {
                System.out.println("\nYou can't follow to this Person: " + choice + "\n");
            }
        } else {
            System.out.println("There aren't users for subscribe");
        }
    }

    public static void addPosts(){
        System.out.println(user.name + ", " + "please choose post from this list: ");
        for (int i = 0; i < pic.length; i++) {
            System.out.println((i + 1));
            System.out.println(pic[i]);
        }
        if (data.isEmpty()){
            System.out.println("You don't registered, please do the registration or Log In");
        } else {
            int choice = in.nextInt();
            Posts post = new Posts(pic[choice - 1], 0);
            user.posts.add(post);
        }
    }

    public static String likingPosts() {
        if (user.followings.size() != 0) {
            int j = 0;
            for (int i = 0; i < user.followings.size(); i++) {
                for (; j < user.followings.get(i).posts.size(); j++) {
                    System.out.println("------------------");
                    System.out.println(user.followings.get(i).id + " " + user.followings.get(i).name);
                    System.out.println("Number of the post: " + j);
                    System.out.println(user.followings.get(i).posts.get(j).posts);
                    System.out.println("Likes: " + user.followings.get(i).posts.get(j).likes);
                    System.out.println("------------------");
                }
            }
            System.out.print("Write the ID and number of the post or \n100 to EXIT: ");
            int choiceId = in.nextInt();
            if (choiceId == 100) {
                System.out.println("Main menu: \n");
                return "";
            }
            int choicePost = in.nextInt();
            if (choiceId == 100) {
                System.out.println("Main menu: \n");
                return "";
            }
            for (int i = 0; i < user.followings.size(); i++) {
                if (user.followings.get(i).id == choiceId) {
                    for (int k = 0; k < user.followings.get(i).posts.size(); k++) {
                        if (k == choicePost) {
                            user.followings.get(i).posts.get(choicePost).likes++;
                            System.out.println("You liked successfully!");
                            return "";
                        }
                    }
                }
            }
            System.out.println("Please, choose another person!");
            return likingPosts();
        } else {
            System.out.println("You don't have active posts.");
            return "";
        }
    }

    public static String unsubscribe() {
        if(user.followings.size() != 0) {
            System.out.println("-------Your subscriptions-------");
            for (int i = 0; i < user.followings.size(); i++) {
                System.out.println(user.followings.get(i).id + " " + user.followings.get(i).name + " " + user.followings.get(i).lastName);
            }
            System.out.println("--------------------------------\n");
            System.out.print("Write ID of the person you want to unsubscribe or \n100 to EXIT: ");
            int choice = in.nextInt();

            if(choice == 100) {
                System.out.println("Main menu: \n");
                return "";
            }
            int tmpSize = user.followings.size();
            for (int i = 0; i < user.followings.size(); i++) {
                if (user.followings.get(i).id == choice) {
                    user.followings.remove(user.followings.get(i));
                }
            }
            if (tmpSize == user.followings.size()) {
                System.out.println("Choose another person.\n");
                return unsubscribe();
            } else {
                System.out.println("You unsubscribed successfully!\n");
                return "";
            }
        } else {
            System.out.println("You don't have subscriptions.");
            return "";
        }
    }
}