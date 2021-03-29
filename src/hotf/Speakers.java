package hotf; /* Part of the HOTF package */

import java.util.Scanner; /* Allows for user input. */

import java.util.Random; /* Allows for random number generation. */

public class Speakers extends Appliance { /* This allows Java Class Speakers to extend properties from Appliance */

    
    public Speakers(String name) {

        this.name = name;
        
        System.out.println("Speakers Object Created"); /* Prints a message to the users screen. */

    }
    
    public static void SpeakersVar() { /* Creating a method to hold the variables for Speakers class. */
        
        Random rand = new Random(); /* Creates a random number object. */
        
        String[] arr={"Lounge", "Kitchen", "Bedroom", "Bathroom", "Dining Room"}; /* Creates an array of locations. */
        
        Random r=new Random(); /* Creates a random number object. */
        
        int randomNumber=r.nextInt(arr.length); /* Creates a random number between 0 and the length of the array. */
                        
        energyused = rand.nextInt(10) + 1; /* How much energy does the device use per hour? */
               
        name = "Speakers"; /* Name of the device? */
                
        location = arr[randomNumber]; /* Where is the device located? */
                
        brand = "Bose"; /* What brand is the device? */
        
        id = 4; /* ID number for the device? */
    }
    
 private static String w = ""; /* Creating a String variable called "W" */
    
    private static Scanner inp = new Scanner(System.in); /* Creating a new Scanner input called "inp" */
    
    public static void spkrtimeon() { /* Creating spkrtimeon() method. */
        
        System.out.println("How many hours was the Speaker device on for?"); /* Write a message to the users screen */
        
        String a = inp.nextLine(); /* String "A" is equal to user input "inp". */
        
        w = a; /* String "W" is equal to String "a". */
        
    }
    
    public static String timeon(){ /* Create a method called timeon() */
        
        return w; /* Return variable "W" into the method. */       
                    
    }
    
}

