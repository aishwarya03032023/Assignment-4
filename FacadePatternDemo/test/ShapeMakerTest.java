/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import facadepatterndemo.ShapeMaker;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A test facade class
 */
public class ShapeMakerTest {
     
    /**
     * A test method to validate if draw method for Circle class is executed successfully.
     */
    @Test
    public void testdrawCircle(){
        // An object of ShapeMaker class is created
        ShapeMaker shapeMaker = new ShapeMaker();

         /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /**  Calls the drawCircle method */
        shapeMaker.drawCircle();

        /** Reset standard output to System.out */
        System.setOut(System.out);

        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("class Circle implementing draw method.", outputStream.toString().trim());
    
    }

    /**
     * A test method to validate if draw method for Rectangle class is executed successfully.
     */
    @Test
    public void testdrawRectangle(){
        // An object of ShapeMaker class is created
        ShapeMaker shapeMaker = new ShapeMaker();
        
         /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /**  Calls the drawRectangle method */
        shapeMaker.drawRectangle();

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
        ShapeMaker shapeMaker = new ShapeMaker();
        
         /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /**  Calls the drawSquare method */
        shapeMaker.drawSquare();

        /** Reset standard output to System.out */
        System.setOut(System.out);

        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("Class Square implementing draw method.", outputStream.toString().trim());
    
    }
    
    
}
