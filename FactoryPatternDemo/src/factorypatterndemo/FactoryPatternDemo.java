/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypatterndemo;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 ** Main class of the program
 * It is a demo class that will make use of ShapeFactory class to demonstrate Factory Design Pattern.
 */
public class FactoryPatternDemo {

    /**
     * Main function.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**An instance of ShapeFactory is created.*/
        ShapeFactory shapeFactory = new ShapeFactory();
        
        /** Get an object of Circle and call its draw method */
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        
        /** Call draw method of Circle  */
        shape1.draw();
     
        /** Get an object of Square and call its draw method */
        Shape shape3 = shapeFactory.getShape("Square");
        
        /** Call draw method of Square*/
        shape3.draw();
        
        /** Get an object of Rectangle and call its draw method */
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        
        /** Call draw method of Rectangle */
        shape2.draw();
        
    }
    
}
