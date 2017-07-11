/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import Chapter02.Classes.Picture;

/**
 *
 * @author chris
 */
public class PEe2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Picture pic = new Picture();
        //load file
        String strPath = "src/Chapter02/Classes/queen-mary.png";
        pic.load(strPath);
        int width = pic.getWidth() / 2;
        int height = pic.getHeight() / 2;
        pic.scale(width, height);
        //move to centre
        pic.move(width/2, height/2);
        
        
        
    }
    
}
