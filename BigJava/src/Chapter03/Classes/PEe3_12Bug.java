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
public class PEe3_12Bug {

    private int position;
    private int  move = 1;
    
    public PEe3_12Bug(int initialPostion) {
        position = initialPostion;
    }
    
    public void turn(){
        move = move * (-1);
    }
    
    public void move(){
        position += move;
    }
    
    public int getPosition(){
        return position;
    }
    
    
}
