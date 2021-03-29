package hotf; /* Part of the HOTF package */

import java.util.Scanner; /* Allows for user input. */

import java.util.Random; /* Allows for random number generation. */

public class Refrigirator extends Appliance { /* This allows Java Class Refrigirator to extend properties from Appliance */
    
    
    public Refrigirator(String name) {

        this.name = name;
        
        System.out.println("Refrigirator Object Created"); /* Prints a message to the users screen. */

    }
    
    public static void RefrigiratorVar() { /* Creating a method to hold the variables for Refrigirator class. */
      
        Random rand = new Random(); /* Creates a random number object. */
        
        String[] arr={"Garage", "Kitchen"}; /* Creates an array of locations. */
        
        Random r=new Random(); /* Creates a random number object. */
        
        int randomNumber=r.nextInt(arr.length); /* Creates a random number between 0 and the length of the array. */
        
        energyused = rand.nextInt(30) + 1; /* How much energy does the device use per hour? */
                      
        name = "Refrigirator"; /* Name of the device? */
                
        location = arr[randomNumber]; /* Where is the device located? */
                
        brand = "KitchenAid"; /* What brand is the device? */
        
        id = 1; /* ID number for the device? */
    }
    
 private static String x = ""; /* Creating a String variable called "X" */
    
    private static Scanner inp = new Scanner(System.in); /* Creating a new Scanner input called "inp" */
    
    public static void rftimeon() { /* Creating rftimeon() method. */
        
        System.out.println("How many hours was the Refrigirator device on for?"); /* Write a message to the users screen */
        
        String a = inp.nextLine(); /* String "A" is equal to user input "inp". */
        
        x = a; /* String "X" is equal to String "a". */
        
    }
    
    public static String timeon(){ /* Create a method called timeon() */
        
        return x; /* Return variable "X" into the method. */       
                    
    }
    
}
