/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes.Supplements;

/**
 *
 * @author chris
 */
public class Counter {
    private int value;
    
    /**
     * Gets the current value of this counter
     * @return the current value
     */
    public int getValue()
    {
        return value;
    }
    
    /**
     * Advances the value of this counter by 1.
     */
    public void click()
    {
        value = value + 1;
    }
    
    /**
     * Resets the value of this counter to 0.
     */
    public void reset()
    {
        value = 0;
    }
}
