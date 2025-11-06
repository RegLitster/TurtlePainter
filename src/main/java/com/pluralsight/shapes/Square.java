package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Square extends Shape {

    public Square(Turtle turtle, Point location, Color color, double border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(location);
        turtle.setPenWidth(border);
        turtle.setColor(color);
        turtle.penDown();

        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(200);


    }
}
