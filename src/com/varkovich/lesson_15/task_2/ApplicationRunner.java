package com.varkovich.lesson_15.task_2;

import com.varkovich.lesson_15.task_2.model.Figure;
import com.varkovich.lesson_15.task_2.model.impl.Circle;
import com.varkovich.lesson_15.task_2.model.impl.Rectangle;
import com.varkovich.lesson_15.task_2.model.impl.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача 2
 * Создать коллекцию фигур.
 * (взять классы для фигур из предыдущих домашних заданий)
 * Заполнить коллекцию различными фигурами.
 * Пройти циклом по коллекции и вызвать метод для подсчета и вывода на экран периметра каждой фигуры.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle(43));
        figures.add(new Rectangle(34, 67));
        figures.add(new Triangle(3, 4, 5));
        figures.add(new Circle(520));

        figures.forEach(figure -> figure.showInformationAboutFigure());
    }
}
