/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypatterndemo;

/**
 *
 * @author Aishwarya
 * @version 1.0
 * 
 * A factory class.
 */
public class ShapeFactory {
    /**
     * Use getShape method to get object of type shape
     *  @param shapeType The type of shape to create ("CIRCLE," "RECTANGLE," or "SQUARE").
     * @return A Shape object corresponding to the given shape type, or null if the type is invalid.
    
     */
    public Shape getShape(String shapeType){
        /** Comparing shapeType with null. if True, return null.*/
        if(shapeType==null){
            return null;
        }
        /** Comparing shapeType to CIRCLE while ignoring case. */
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        /** Comparing shapeType to RECTANGLE while ignoring case. */
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
         /** Comparing shapeType to SQUARE while ignoring case. */
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        /** Return null if doesn't match any of the previous conditions */
        return null;
    }

}
