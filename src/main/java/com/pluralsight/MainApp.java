package com.pluralsight;

import com.pluralsight.shapes.Shape;
import com.pluralsight.shapes.Square;
import com.pluralsight.shapes.Triangle;
import com.pluralsight.shapes.Circle;
import com.pluralsight.shapes.Hexagon;

import java.awt.*;
import java.util.Scanner;

public class MainApp
{   public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        System.out.print("Enter world width: ");
        int width = scan.nextInt();

        System.out.print("Enter world height: ");
        int height = scan.nextInt();

        World world = new World(width, height);
        Turtle turtle = new Turtle(world);

        boolean running = true;

        Shape square = new Square(turtle, new Point(-100,-100),Color.GREEN, 2);
        Shape hexagon = new Hexagon(turtle, new Point(10,-100),Color.GREEN, 2);
        Shape triangle = new Triangle(turtle, new Point(-180,200),Color.GREEN, 2);
        Shape circle = new Circle(turtle,new Point(-50,200),Color.GREEN,2,200);

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);

    }




}
