package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {

    // Test case for creating a circle
    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("circle");
        assertTrue(circle instanceof Circle);
    }

    // Test case for creating a rectangle
    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }

    // Test case for creating an invalid shape
    @Test
    public void testCreateInvalidShape() {
        Shape invalidShape = ShapeFactory.createShape("hexagon");
        assertNull(invalidShape);
    }
}

