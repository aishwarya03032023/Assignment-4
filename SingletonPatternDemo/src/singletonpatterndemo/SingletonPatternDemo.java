/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpatterndemo;

/**
 *
 * @author Aishwarya
 * @version 1.0
 */

/** A main class that demonstrates the Singleton Design Pattern.*/
public class SingletonPatternDemo {

    /**
     * The main method of this Java Application.
     * 
     * @param args the command line arguments (unused).
     * 
     * Couldn't include @return tag as its giving error '@return tag cannot be used in method with void return type.'
     */
    
    public static void main(String[] args) {
        
        /**
         * Get the only object available
         * This variable holds the instance of SingleObject class
         */
        SingleObject object = SingleObject.getInstance();
        
        /**
         * Calls a method in SingleObject class to display a message
         * This line shows the implementation of SingleObject instance to invoke the showMessage method.
         */
        object.showMessage();
    }
    
}
