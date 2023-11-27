/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import factorypatterndemo.Circle;
import factorypatterndemo.Shape;
import factorypatterndemo.ShapeFactory;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A test factory design pattern class
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }

    /**
     * A test method to validate if draw method for Circle class is executed successfully.
     */
    @Test
    public void testdrawCircle(){
        // An object of ShapeFactory class is created
        ShapeFactory shapeFactory = new ShapeFactory();

         /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /** Calls the drawCircle method */
        shapeFactory.getShape("CIRCLE").draw();

        /** Reset standard output to System.out */
        System.setOut(System.out);

        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("Class Circle implementing draw method.", outputStream.toString().trim());
    
    }

    /**
     * A test method to validate if draw method for Rectangle class is executed successfully.
     */
    @Test
    public void testdrawRectangle(){
        // An object of ShapeMaker class is created
        ShapeFactory shapeFactory = new ShapeFactory();
        
         /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /** Calls the drawRectangle method */
        shapeFactory.getShape("RECTANGLE").draw();

        /** Reset standard output to System.out */
        System.setOut(System.out);

        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("Class Rectangle implementing draw method.", outputStream.toString().trim());
    
    }
    
    /**
     * A test method to validate if draw method for Square class is executed successfully.
     */
    @Test
    public void testdrawSquare(){
        // An object of ShapeMaker class is created
        ShapeFactory shapeFactory = new ShapeFactory();
        /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /** Calls the drawRectangle method */
        shapeFactory.getShape("SQUARE").draw();

        /** Reset standard output to System.out */
        System.setOut(System.out);

        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("Class Square implementing draw method.", outputStream.toString().trim());
    
    }
    
}
