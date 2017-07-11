package Chapter01.Programming_Projects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class PPp1_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Traveling from Rhyl To Llandudno");
        System.out.println("+----------+");
        System.out.println("| By Train |");
        System.out.println("+----------+");
        double ticket1 = 8.70; //£
        double ticket2 = 8.50;
        System.out.println("Train Ticket (Day Return): " + ticket1);
        System.out.println("Train Ticket (Single): " + ticket2 + "|| Round-trip: " + ticket2 * 2);
        
        System.out.println("+--------+");
        System.out.println("| By Car |");
        System.out.println("+--------+");
        
        /** ALGORITHM
         * Compute Gas used from travel depending on car Fuel Efficiency
         * Gas used = fuel Efficiency / distance
         * multiply gas used to gas Price
         * Gas Cost = Gas Used * gas Price
         * multiple maintenance cost to distance
         * 
         */
        
        double fEfficiency = 67; //MPG
        double distance = 18.3;  //Miles

        System.out.println("Fuel Efficiency to distance ratio: " + fEfficiency + " : " + distance);
        double gasPrice = 4.00; //per galon
        double maintenance = 0.05; //per mile
        
        double gasUsed = distance/fEfficiency;
        System.out.printf("Gas Used (1 Gallon): %2.2f \n", gasUsed);
        
        double gasCost = gasUsed * gasPrice  ;
        System.out.printf("Gas Cost: %2.2f\n" , gasCost);
        double maintenanceCost = distance * maintenance;
        System.out.println("Maintenance cost: " + maintenanceCost);
        
        double carTravel = maintenanceCost + gasCost;
        System.out.printf("Total by Car: %4.2f || Round-trip: %4.2f \n", carTravel, carTravel * 2);
        System.out.println("+------------+");
        System.out.println("| Conclusion |");
        System.out.println("+------------+");
        
        if(carTravel > ticket1){
            System.out.println("Train ticket is cheaper than car cost");
        } else{
            System.out.println("Car is cheaper than Train ticket");
        }
        
        
    }
    
}
