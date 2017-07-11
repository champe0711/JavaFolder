/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Projects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Christian Paul
 */
public class Project21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar eckertsBirthday = new GregorianCalendar(1919, Calendar.APRIL, 9);
//        cal.add(Calendar.DAY_OF_MONTH, 11);
        
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        
        System.out.println("DAY = " + dayOfMonth + "\nMONTH = "+month+"\nYEAR = "+year+"\nDay in WEEK = "+weekday);
        
        
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        System.out.println(df.format(d));
        
    }
    
}
