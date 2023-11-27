/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A facade class that provides a simplified interface to a set of shape classes like Circle, Square and Rectangle.
 * This class encapsulates the complexity of interacting with individual shape classes and offers a unified and easy-to-use interface for drawing different shapes.
 */
public class ShapeMaker {
    /**
     * Declaring private instance variables representing shapes (circle, square, rectangle).
     */
    private Shape circle;
    private Shape square;
    private Shape rectangle;
    /** 
     * Constructor for ShapeMaker that initializes instances of Circle, Square and Rectangle.
     */
    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }
    
    /**
     * Calls the draw method for a circle using Circle class.
     */
    public void drawCircle(){
        circle.draw();
    }
    
    /**
     * Calls the draw method for a square using Square class.
     */
    public void drawSquare(){
        square.draw();
    }
    
    /**
     * Calls the draw method for a rectangle using Rectangle class.
     */
    public void drawRectangle(){
        rectangle.draw();
    }
}
