package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;


public abstract class Shape {

protected Turtle turtle;
protected Point location;
protected Color color;
protected double border;

    public Shape(Turtle turtle, Point location, Color color, double border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public abstract void paint();

}


