package hotf; /* Part of the HOTF package */

import java.util.Scanner; /* Allows for user input. */

import java.util.Random; /* Allows for random number generation. */

public class HeatingAircon extends Appliance { /* This allows Java Class HeatingAircon to extend properties from Appliance */
   

    public HeatingAircon(String name) {

        this.name = name;
        
        System.out.println("Heating/Aircon Object Created"); /* Prints a message to the users screen. */

    }
    
    public static void HeatingAirconVar() { /* Creating a method to hold the variables for HeatingAircon class. */
        
        Random rand = new Random(); /* Creates a random number object. */
        
        String[] arr={"Lounge", "Kitchen", "Bedroom", "Bathroom", "Dining Room"}; /* Creates an array of locations. */
        
        Random r=new Random(); /* Creates a random number object. */
        
        int randomNumber=r.nextInt(arr.length); /* Creates a random number between 0 and the length of the array. */
        
        energyused = rand.nextInt(100) + 1; /* How much energy does the device use per hour? */
                        
        name = "HeatingAircon"; /* Name of the device? */
                
        location = arr[randomNumber]; /* Where is the device located? */
                
        brand = "Aircool"; /* What brand is the device? */
        
        id = 2; /* ID number for the device? */
    }
    
private static String v = ""; /* Creating a String variable called "V" */
    
    private static Scanner inp = new Scanner(System.in); /* Creating a new Scanner input called "inp" */
    
    public static void htartimeon() { /* Creating htartimeon() method. */
        
        System.out.println("How many hours was the Aircon/Heater device on for?"); /* Write a message to the users screen */
        
        String a = inp.nextLine(); /* String "A" is equal to user input "inp". */
        
        v = a; /* String "V" is equal to String "a". */
        
    }
    
    public static String timeon(){ /* Create a method called timeon() */
        
        return v; /* Return variable "V" into the method. */       
                    
    }
    
}
