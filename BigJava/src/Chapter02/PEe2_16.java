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
public class PEe2_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Picture pic = new Picture();
        //load file
        String strPath = "src/Chapter02/Classes/queen-mary.png";
        pic.load(strPath);
        int newWidth = pic.getWidth() * 2;
        int newHeight = pic.getHeight() * 2;
        System.out.println("W: " + pic.getWidth() + " newW: " + newWidth);
        System.out.println("H: " + pic.getHeight() + "newH: " + newHeight);
        //new H: 1024 and W: 768
        //new pointer x: -(1024/4) y:-(768/4) to focus on middle
        
        pic.move( -(newWidth /4 ) ,-(newHeight / 4) );
        pic.scale(newWidth, newHeight);
        //move to centre
//        pic.move(width, width);
    }

}
