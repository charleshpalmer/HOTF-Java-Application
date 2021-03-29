package hotf;

import java.util.Random; /* Allows for random number generation. */

public class Home extends Appliance {
  
    public static void HomeVar() { /* Creating a method to hold the variables for TV class. */
                
        String[] arr={"TV", "Microwave", "Refrigirator", "Speakers", "HeatingAircon"}; /* Creates an array of locations. */
        
        Random r=new Random(); /* Creates a random number object. */
        
        int randomNumber=r.nextInt(arr.length); /* Creates a random number between 0 and the length of the array. */
     
        indicator = arr[randomNumber]; /* Random string selected from the Array. */
                        
    }
    
}
