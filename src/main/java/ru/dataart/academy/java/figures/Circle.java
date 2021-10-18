package ru.dataart.academy.java.figures;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Circle - class inherited from the Figure abstract class
 * and implements methods for calculating the area and perimeter.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return PI * pow(radius, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * radius;
    }
}
