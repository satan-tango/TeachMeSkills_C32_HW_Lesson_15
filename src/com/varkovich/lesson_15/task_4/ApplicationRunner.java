package com.varkovich.lesson_15.task_4;

import java.util.HashSet;
import java.util.Set;

/**
 * Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
 * Вывести коллекцию на экран
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Andrew");
        names.add("Dmitriy");
        names.add("Ilya");
        names.add("Bogdan");
        names.add("Igor");
        names.add("Marina");
        names.add("Daniil");
        names.add("Sultan");
        names.add("Georgi");
        names.add("Kirill");
        names.add("Kate");
        names.add("Dmitry");
        names.add("Rita");
        names.add("Vlad");
        names.add("Sergio");
        names.add("Oleg");

        names.forEach(System.out::println);
    }
}
