/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * Main class of the program
 * It is a demo class that will make use of ShapeMaker class to demonstrate Facade Design Pattern.
 */
public class FacadePatternDemo {

    /**
     * The main method of the program
     * @param args the command line arguments(unused).
     * Couldn't include @return tag as its giving error '@return tag cannot be used in method with void return type.'
     */
    public static void main(String[] args) {
        /**
         * An instance of ShapeMaker is created.
         */
        ShapeMaker shapeMaker = new ShapeMaker();
        
        /**
         * Making use of the shapeMaker instance to call methods to draw shapes like Circle, Square and Rectangle.
        */
        /**
         * Calls drawCircle method.
         */
        shapeMaker.drawCircle();
        /**
         * Calls drawSquare method.
         */
        shapeMaker.drawSquare();
        /**
         * Calls drawRectangle method.
         */
        shapeMaker.drawRectangle();
    }
    
}
