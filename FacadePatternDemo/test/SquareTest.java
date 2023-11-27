/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import facadepatterndemo.Square;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A test class to validate if Facade Design Pattern is implemented successfully for Square class.
 */

public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * A test method to validate if draw method is executed successfully.
     */
    
    @Test
    public void testDraw(){
        // An object of Square class is created
        Square square = new Square();
        
        /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));
        
        /**  Calls the draw method */
        square.draw();
        
        /** Reset standard output to System.out */
        System.setOut(System.out);
        
        /** Validating if the text matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("Class Square implementing draw method.", outputStream.toString().trim());
    }
}
