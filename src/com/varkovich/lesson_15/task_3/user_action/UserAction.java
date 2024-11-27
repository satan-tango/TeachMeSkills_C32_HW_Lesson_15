package com.varkovich.lesson_15.task_3.user_action;

import java.util.Scanner;

public class UserAction {

    public static String getCollectionLengthFromUser() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter length of the collection -> ");

        return console.next();
    }
}
