package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Triangle extends Shape {

    public Triangle(Turtle turtle, Point location, Color color, double border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(location);
        turtle.setPenWidth(border);
        turtle.setColor(color);

        turtle.penDown();

        turtle.forward(400);
        turtle.turnRight(120);
        turtle.forward(400);
        turtle.turnRight(120);
        turtle.forward(400);
    }
}
