package hotf; /* Part of the HOTF package */

import java.util.Scanner; /* Allows for user input. */

import java.util.Random; /* Allows for random number generation. */

public class Microwave extends Appliance { /* This allows Java Class Microwave to extend properties from Appliance */
        
    
    public Microwave(String name) {

        this.name = name;
        
        System.out.println("Microwave Object Created"); /* Prints a message to the users screen. */

    }
    
    public static void MicrowaveVar() { /* Creating a method to hold the variables for Microwave class. */
        
        Random rand = new Random(); /* Creates a random number object. */
        
        String[] arr={"Garage", "Kitchen", "Rented Bedroom"}; /* Creates an array of locations. */
        
        Random r=new Random(); /* Creates a random number object. */
        
        int randomNumber=r.nextInt(arr.length); /* Creates a random number between 0 and the length of the array. */
        
        energyused = rand.nextInt(10) + 1; /* How much energy does the device use per hour? */
                      
        name = "Microwave"; /* Name of the device? */
                
        location = arr[randomNumber]; /* Where is the device located? */
                
        brand = "Samsung"; /* What brand is the device? */
        
        id = 3; /* ID number for the device? */
        
    }
    
     private static String y = ""; /* Creating a String variable called "Y" */
    
    private static Scanner inp = new Scanner(System.in); /* Creating a new Scanner input called "inp" */
    
    public static void mctimeon() { /* Creating mctimeon() method. */
        
        System.out.println("How many hours was the Microwave device on for?"); /* Write a message to the users screen */
        
        String a = inp.nextLine(); /* String "A" is equal to user input "inp". */
        
        y = a; /* String "Y" is equal to String "a". */
        
    }
    
    public static String timeon(){ /* Create a method called timeon() */
        
        return y; /* Return variable "Y" into the method. */       
                    
    }
    
}
    

