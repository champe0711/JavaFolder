/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes;

/**
 *
 * @author chris
 */
public class PEe3_13Moth {
    
    private double position;
    
    public PEe3_13Moth(double initialPosition){
        position = initialPosition;
    }
    
    public void moveToLight(double lightPosition){
        position += ( lightPosition - position)/2;
    }
    
    public double getPosition(){
        return position;
    }
}
