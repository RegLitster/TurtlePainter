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
    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        System.out.print("Enter world width: ");
        int width = scan.nextInt();

        System.out.print("Enter world height: ");
        int height = scan.nextInt();

        World world = new World(width, height);
        Turtle turtle = new Turtle(world);

        boolean run = true;
        while (run) {
            System.out.println("""
                    \n===== Turtle World Draw =====
                    What would you like to do?
                    1: Add Shape
                    2: Save Image
                    0: Exit
                    """);

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> addShape(scan, turtle);
                case 2 -> saveImage(world, scan);
                case 0 -> {
                    System.out.println("Thank You For Drawing.\n GoodBye!");
                    run = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        scan.close();
        System.exit(0);
    }

    private static void addShape(Scanner scanner, Turtle turtle) {
        System.out.println("""
                Select shape:
                1: Square
                2: Circle
                3: Triangle
                4: Hexagon""");
        int shapeChoice = scanner.nextInt();

        double radius = 0;
        if (shapeChoice == 2) {
            System.out.print("Enter radius: ");
            radius = scanner.nextDouble();
        }

        System.out.print("Enter pen width: ");
        double border = scanner.nextDouble();

        System.out.print("Enter pen color (red, green, blue, black): ");
        String colorName = scanner.next().toLowerCase();
        Color color = switch (colorName) {
            case "red" -> Color.RED;
            case "green" -> Color.GREEN;
            case "blue" -> Color.BLUE;
            case "black" -> Color.BLACK;
            default -> Color.BLACK;
        };

        System.out.print("Enter X location: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y location: ");
        int y = scanner.nextInt();

        Point location = new Point(x, y);
        Shape shape = null;

        switch (shapeChoice) {
            case 1 -> shape = new Square(turtle, location, color, border);
            case 2 -> shape = new Circle(turtle, location, color, border, radius);
            case 3 -> shape = new Triangle(turtle, location, color, border);
            case 4 -> shape = new Hexagon(turtle, location, color, border);
            default -> System.out.println("Invalid shape.");
        }


        assert shape != null;
        shape.paint();

    }

    private static void saveImage(World world, Scanner scanner) {
        System.out.print("Enter filename (e.g., art.png): ");
        String filename = scanner.next();
        world.saveAs(filename);
        System.out.println("Image saved as " + filename);
    }


}
