/* 
* Write a class Bug that models a bug moving along a horizontal line. The bug moves either to the right or left. Initially, the bug moves to the right, but it can turn to change its direction. In each move, its position changes by one unit in the current direction. Provide a constructor and methods.
 * 
 * your bugTester should construct a bug, make it move and turn a few times, and print the actual and expected position.
 */

package Misc;

public class Bug {
    private int position;
    private int direction = 1;
    
    public Bug(){
        
    }
    
    public Bug(int initialPosition){
        this.position = initialPosition;
    }
    
    public void turn(){
        this.direction = this.direction * -1;
    }
    
    public void move(){
        this.position += this.direction;
    }
    
    public int getPosition(){
        return this.position;
    }
    
    
    
}
