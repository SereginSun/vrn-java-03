package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

/**
 * Main class.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public class Main{
    public static void main(String[] args) {
        System.out.print("Task for Java OOP");
        Figure circle = new Circle(3);
        Figure rectangle = new Rectangle(2, 3);
        Figure[] figures = {circle, rectangle};
        Calculator calculator = new Calculator();
        double sum = calculator.calcSumOfAreas(figures);
        System.out.printf("%nThe sum of the areas: %f%n", sum);
    }
}