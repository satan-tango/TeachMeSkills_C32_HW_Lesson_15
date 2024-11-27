package com.varkovich.lesson_15.task_2.model.impl;

import com.varkovich.lesson_15.task_2.model.Figure;

public class Triangle implements Figure {

    public final String FIGURE_NAME = "triangle";

    public double firstSide;

    public double secondSide;

    public double thirdSide;


    public Triangle(double fistSide, double secondSide, double thirdSide) {
        this.firstSide = fistSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double perimeterCalculation() {
        return (firstSide + secondSide + thirdSide) / 2;
    }


    @Override
    public void showInformationAboutFigure() {
        System.out.printf("%s(%.2f,%.2f,%.2f) P= %.2f\n\n", FIGURE_NAME, firstSide, secondSide,
                thirdSide, perimeterCalculation());
    }
}
