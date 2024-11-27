package com.varkovich.lesson_15.task_2.model.impl;

import com.varkovich.lesson_15.task_2.model.Figure;

public class Rectangle implements Figure {

    public final String FIGURE_NAME = "rectangle";

    public double length;

    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * (length + width);
    }

    @Override
    public void showInformationAboutFigure() {
        System.out.printf("%s(%.2f,%.2f) P= %.2f\n\n", FIGURE_NAME, length, width, perimeterCalculation());
    }
}
