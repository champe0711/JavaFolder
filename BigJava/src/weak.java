
import java.util.Scanner;

/**
 *
 * @author Darlene
 */
public class weak {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("My friends birthday calendar");
        System.out.println("Friend's name: ");
        String name = in.nextLine();
        System.out.println("Friend's birthday: ");
        String bday = in.nextLine();
        System.out.printf("My friend %10s birth is on %10s", name, bday);
        
    }
}
