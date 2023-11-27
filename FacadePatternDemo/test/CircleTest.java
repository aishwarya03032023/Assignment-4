/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import facadepatterndemo.Circle;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 *  A test class to validate if Factory Design Pattern is implemented successfully for Circle class.
 */
public class CircleTest {
    
    public CircleTest() {
    }

    /**
     * A test method to validate if draw method is executed successfully.
     */
    
    @Test
    public void testDraw(){
        // An object of Circle class is created
        Circle circle = new Circle();
        
        /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));
        
        /**  Calls the draw method */
        circle.draw();
        
        /** Reset standard output to System.out */
        System.setOut(System.out);
        
        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("class Circle implementing draw method.", outputStream.toString().trim());
    
    }
}
