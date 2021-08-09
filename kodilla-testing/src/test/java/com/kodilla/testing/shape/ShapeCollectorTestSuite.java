package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test: Adding figures")
    class TestAddFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Triangle(5, 12));

            //Then
            Assertions.assertEquals(3, shapeCollector.shapesSize());
        }
    }

    @Nested
    @DisplayName("Tests: Removing figures")
    class TestRemoveFigures {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(8));
            shapeCollector.addFigure(new Triangle(3, 4));

            //When
            boolean result = shapeCollector.removeFigure(new Circle(8));

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(1, shapeCollector.shapesSize());
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(new Circle(3));

            //Then
            Assertions.assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests: Getting figures")
    class TestGetFigures {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Triangle(5, 12));

            //When
            Shape retrievedShape = shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(new Triangle(5, 12), retrievedShape);
        }

        @Test
        void testGetFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Triangle(5, 5));

            //When
            Shape retrievedShape = shapeCollector.getFigure(5);

            //Then
            Assertions.assertNull(retrievedShape);
        }
    }

    @Nested
    @DisplayName("Tests: Show figures")
    class TestShowFigures {
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            String expectedFigures = new Circle(2) + ", " + new Square(4) + ", " + new Triangle(5, 12);
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Triangle(5, 12));

            //Then
            Assertions.assertEquals(expectedFigures, shapeCollector.showFigures());
        }
    }
}