package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Circle extends Shape {
    private final double radius;

    public Circle(Turtle turtle, Point location, Color color, double border,double radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(location);

        turtle.setPenWidth(border);
        turtle.setColor(color);
        turtle.penDown();

        int sides = 50;
        double circumference = 2 * Math.PI * radius;
        double sideLength = circumference / sides;
        double angle = 360.0 / sides;

        for (int i = 0; i < sides; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(angle);
        }

        turtle.penUp();
    }
}
