package org.howard.edu.lsp.oopfinal.question3;

// Client class to demonstrate shape creation and drawing
public class Client {
    public static void main(String[] args) {
        // Create a circle shape
        Shape c = ShapeFactory.createShape("circle");
        c.draw();

        // Create a rectangle shape
        Shape r = ShapeFactory.createShape("rectangle");
        r.draw();
    }
}
