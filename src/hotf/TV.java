package hotf; /* Part of the HOTF package */

import java.util.Scanner; /* Allows for user input. */

import java.util.Random; /* Allows for random number generation. */

public class TV extends Appliance { /* This allows Java Class TV to extend properties from Appliance */

        
    public TV(String name) {

        this.name = name;
        
        System.out.println("TV Object Created"); /* Prints a message to the users screen. */

    }
    
    public static void TVVar() { /* Creating a method to hold the variables for TV class. */
        
        Random rand = new Random(); /* Creates a random number object. */
        
        String[] arr={"Lounge", "Kitchen", "Bedroom", "Bathroom", "Dining Room"}; /* Creates an array of locations. */
        
        Random r=new Random(); /* Creates a random number object. */
        
        int randomNumber=r.nextInt(arr.length); /* Creates a random number between 0 and the length of the array. */
        
        energyused = rand.nextInt(15) + 1; /* How much energy does the device use per hour? */
                     
        name = "TV"; /* Name of the device? */
                
        location = arr[randomNumber]; /* Where is the device located? */
                
        brand = "LG"; /* What brand is the device? */
        
        id = 5; /* ID number for the device? */         
        
    }
    
    private static String z = ""; /* Creating a String variable called "Z" */
    
    private static Scanner inp = new Scanner(System.in); /* Creating a new Scanner input called "inp" */
    
    public static void tvtimeon() { /* Creating tvtimeon() method. */
        
        System.out.println("How many hours was the TV device on for?"); /* Write a message to the users screen */
        
        String a = inp.nextLine(); /* String "A" is equal to user input "inp". */
        
        z = a; /* String "Z" is equal to String "a". */
        
    }
    
    public static String timeon(){ /* Create a method called timeon() */
        
        return z; /* Return variable "Z" into the method. */      
                    
    }
    
}
