/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;
import singletonpatterndemo.SingleObject;
/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A test class to validate if Singleton Design Pattern is implemented successfully.
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }

    /**
     * A test method that creates 2 instance object of SingleObject and validates if both of them match.
     */
    @Test
    public void testGetInstance() {
        
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();
        assertSame(instance1, instance2);
    }
    
    
    /**
     * A test method to validate if showMessage method is executed successfully.
     */
    @Test
    public void testShowMessage() {
        // An object of SingleObject class is created
        SingleObject instance = SingleObject.getInstance();
        
        /** A ByteArrayOutputStream object created for capturing output.*/
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        /** Setting the output to be redirected to PrintStream instead of the standard System.out
         *This output is captured by outputStream
         */
        System.setOut(new PrintStream(outputStream));

        /**  Calls the showMessage method */
        instance.showMessage();

        /** Reset standard output to System.out */
        System.setOut(System.out);

        /** Validating if the message matches the expected output. 
         * trim() is to get rid of trailing white spaces as it was causing issues with the string matching.
         */
        assertEquals("Hello Aishwarya, Singleton Design Pattern Implemented Successfully.", outputStream.toString().trim());
    
    }
}
