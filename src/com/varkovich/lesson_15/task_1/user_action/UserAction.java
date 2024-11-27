package com.varkovich.lesson_15.task_1.user_action;

import java.util.Scanner;

public class UserAction {

    public static String getNumberFromUser() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number -> ");

        return console.next();
    }
}
