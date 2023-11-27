/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpatterndemo;

/**
 *
 * @author Aishwarya
 * @version 1.0
 */


 /** A public class of SingleObject that implements the concept of Singleton Pattern Demo.
 */
public class SingleObject {
    /**An object of SingleObject is created which holds a single instance of the class.*/
    private static SingleObject instance = new SingleObject();
    
    /**
     * Making the constructor private so that this class cannot be instantiated from outside of the class.
     * This ensure only a single instance of the class is created.
     */
    private SingleObject(){}
    
    /**
     * Getting the only available object: instance.
     * @return the single instance of SingleObject.
     */
    public static SingleObject getInstance(){
        return instance;
    }
    
    /**Displays a message of successful implementation of Singleton Design Pattern when called. */
    public void showMessage(){
        System.out.println("Hello Aishwarya, Singleton Design Pattern Implemented Successfully.");
    }
}
