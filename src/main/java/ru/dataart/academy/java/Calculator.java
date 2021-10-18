package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

/**
 * Calculator - class for calculation.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public class Calculator {

    /**
     * Method for calculating the sum of the areas of an array of figures.
     * @param figures - array of figures.
     * @return the value of the sum of the areas of the figures.
     */
    public double calcSumOfAreas(Figure[] figures) {
        double sum = 0;
        for (Figure fig : figures) {
            sum += fig.calcSquare();
        }
        return sum;
    }
}
