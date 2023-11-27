/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import facadepatterndemo.FacadePatternDemo;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A test main class to validate functionalities of the main class
 */
public class FacadePatternDemoTest {
    
    public FacadePatternDemoTest() {
    }
    
     /**
     * A test method to validate if getting desired output.
     */
    @Test
    public void testMain(){
        
        /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /** Setting String[] args to null as main class doesn't take parameters.*/
        String[] args = null;
        
        /** Calls the main method*/
        FacadePatternDemo.main(args);

        /** Reset standard output to System.out */
        System.setOut(System.out);

        /** A string representing the expected output */
        String expectedOutput = "class Circle implementing draw method.\nClass Square implementing draw method.\nClass Rectangle implementing draw method.";
        /** Splitting the expectedOutput at every newline */
        String[] expectedLines = expectedOutput.split("\\r?\\n");
        /** Splitting the actual output at every newline */
        String[] actualLines = outputStream.toString().split("\\r?\\n");

        /** Check that each line in the actual output matches the corresponding line in the expected  */
        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }
    }
}
