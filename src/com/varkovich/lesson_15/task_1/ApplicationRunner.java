package com.varkovich.lesson_15.task_1;

import com.varkovich.lesson_15.task_1.user_action.UserAction;

import java.util.ArrayList;
import java.util.List;

/***
 * Задача 1
 * Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
 * При заполнении коллекции числами с консоли следует делать приведения типа.
 * Код для привдения строки к числу можно использовать следующий:
 * 	int i = Integer.parseInt(str);
 * 	или
 * 	int val = Integer.valueOf(str);
 * Для окончания ввода введите слово "exit".
 * При приведении строки к числу, следует учитывать возможность исключений.
 * Некоторые полезные примеры кода для приведения строки к числу можно найти по ссылке
 * На экран вывести четные числа из коллекции.
 */
public class ApplicationRunner {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        String item;
        int number;
        for (; ; ) {
            item = UserAction.getNumberFromUser();
            if (item.equals("exit")) {
                break;
            }

            try {
                number = Integer.valueOf(item);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Only numbers are allowed to enter, try again");
            }
        }

        numbers.stream().filter(k -> k % 2 == 0).forEach(System.out::println);

    }
}
