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
public class PEe3_02Counter {
    private int value;
    private int max;
    
    /**
     * Gets the current value of this counter
     * @return the current value
     */
    public int getValue()
    {
        return value;
    }
    
    public void setLimit(int maximum)
    {
        max = maximum;
    }
    
    /**
     * Advances the value of this counter by 1.
     */
    public void click()
    {
        value = Math.min(1 + value, max);
    }
    
    public void undo()
    {
        value = Math.max(0, value - 1);
    }
    
    /**
     * Resets the value of this counter to 0.
     */
    public void reset()
    {
        value = 0;
    }
}
