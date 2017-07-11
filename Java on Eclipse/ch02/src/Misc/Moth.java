/*
 * Implement a class Moth that models a moth flying across a straight line. the moth has a position, the distance from a fixed origin. When the moth moves towards a point of light, its new position is halfway between its old position and the position of the light source. Supply a constructor and methods.
 * 
 * Your MothTester should construct a moth, move it toward a couple of light sources, and check that the moth's position is as expected
 */

package Misc;


public class Moth {
    private double position;
    
    public Moth(){
        
    }
    
    public Moth(double initialPosition){
        this.position = initialPosition;
    }
    
    
    //new position is halfway between its old position and the position of the light source
    public void moveToLight(double lightPosition){
        this.position = this.position + ((lightPosition - this.position)/2);
    }
    
    public double getPosition(){
        return this.position;
    }
    
}
