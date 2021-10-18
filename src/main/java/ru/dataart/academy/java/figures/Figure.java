package ru.dataart.academy.java.figures;

/**
 * Figure - abstract class.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public abstract class Figure {

    /**
     * Method for calculating the area of a figure.
     * @return a value of type double the area of the figure.
     */
    public abstract double calcSquare();

    /**
     * Method for calculating the perimeter of a figure.
     * @return a value of type double the perimeter of the figure.
     */
    public abstract double calcPerimeter();
}
