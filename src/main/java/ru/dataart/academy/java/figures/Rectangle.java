package ru.dataart.academy.java.figures;

/**
 * Rectangle - class inherited from the Figure abstract class
 * and implements methods for calculating the area and perimeter.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcSquare() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (length + width);
    }
}
