package com.varkovich.lesson_15.task_2.model.impl;

import com.varkovich.lesson_15.task_2.model.Figure;

public class Circle implements Figure {

    public final String FIGURE_NAME = "circle";

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void showInformationAboutFigure() {
        System.out.printf("%s(%.2f) P= %.2f\n\n", FIGURE_NAME, radius, perimeterCalculation());
    }
}
