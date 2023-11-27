/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import factorypatterndemo.Rectangle;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A test class to validate if Factory Design Pattern is implemented successfully for Rectangle class.
 */
public class RectangleTest {
    
    public RectangleTest() {
    }

    /**
     * A test method to validate if draw method is executed successfully.
     */
    
    @Test
    public void testDraw(){
        // An object of Rectangle class is created
        Rectangle rectangle = new Rectangle();
        
        /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));
        
        /**  Calls the draw method */
        rectangle.draw();
        
        /** Reset standard output to System.out */
        System.setOut(System.out);
        
        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("Class Rectangle implementing draw method.", outputStream.toString().trim());
    }

}
