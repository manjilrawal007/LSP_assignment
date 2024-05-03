package org.howard.edu.lsp.oopfinal.question3;

// Factory class for creating shapes
public class ShapeFactory {
    
    // Method to create a shape based on the shape type
    public static Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle(); // Return a Circle object
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle(); // Return a Rectangle object
        }
        return null; // Return null if shape type is invalid
    }
}
