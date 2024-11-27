package com.varkovich.lesson_15.task_3;

import com.varkovich.lesson_15.task_3.user_action.UserAction;
import com.varkovich.lesson_15.task_3.utils.CollectionLengthValidationState;
import com.varkovich.lesson_15.task_3.validator.CollectionLengthValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Создать коллекцию целых чисел.
 * Заполните коллекцию рандомными числами.
 * Пусть размер коллекции задается с консоли.
 * Предусмотреть проверку введенного размера коллекции на валидность.
 * Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        String length;
        CollectionLengthValidationState collectionLengthValidationState;

        for (; ; ) {
            length = UserAction.getCollectionLengthFromUser();
            collectionLengthValidationState = CollectionLengthValidator.
                    validateCollectionLength(length);
            if (collectionLengthValidationState == CollectionLengthValidationState.LENGTH_IS_VALID) {
                break;
            }
            System.out.println(collectionLengthValidationState.getMessage());
        }


        List<Integer> numbers = new Random()
                .ints(1, 20)
                .limit(Integer.valueOf(length))
                .boxed()
                .collect(Collectors.toList());

        numbers.forEach(System.out::println);

        int elementsSum = numbers.stream().reduce((a, b) -> a + b).get();
        System.out.printf("Arithmetic mean -> %d", elementsSum / 2);
    }
}
