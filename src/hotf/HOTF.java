package hotf;

public class HOTF {

    public static void main(String[] args) {
        
        
    int count = 0;    
        
    while (count < 10) {
    
    Home.HomeVar();
    
    
        if (Home.indicator == "TV"){ 
    
        /* Start of TV code block */
       
            count ++; /* Increase the value of count by one */

            TV LG = new TV(TV.brand); /* Creating a new object */

            TV.tvtimeon(); /* Calling the tvtimeon() method from the TV class */

            TV.TVVar(); /* Calling the TVVar() method from the TV class */

            String ontimetv = TV.timeon(); /* Saves the return of the method into a string */

            int energyusedtotaltv = TV.energyused*Integer.parseInt(ontimetv); /* Calculating total energy used by device. */

            System.out.println(LG.getName() + " was on for " + ontimetv + " hours and used " + energyusedtotaltv + " units of energy, it is located in the " + TV.location); /* Prints an output to the users screen. */

            System.out.println(count + " Objects have been created."); /* Print out how many objects have been made */
            
            
            
        } else if (Home.indicator == "Microwave") {

            /* Start of Microwave code block */

            count ++; /* Increase the value of count by one */

            Microwave Samsung = new Microwave(Microwave.brand); /* Creating a new object */

            Microwave.mctimeon(); /* Calling the mctimeon() method from the Microwave class */

            Microwave.MicrowaveVar(); /* Calling the MicrowaveVar() method from the Microwave class */

            String ontimemc = Microwave.timeon(); /* Saves the return of the method into a string */

            int energyusedtotalmc = Microwave.energyused*Integer.parseInt(ontimemc); /* Calculating total energy used by device. */

            System.out.println(Samsung.getName() + " was on for " + ontimemc + " hours and used " + energyusedtotalmc + " units of energy, it is located in the " + Microwave.location); /* Prints an output to the users screen. */

            System.out.println(count + " Objects have been created."); /* Print out how many objects have been made */
            
            

        } else if (Home.indicator == "Refrigirator") {

            /* Start of Refrigirator code block */

            count ++; /* Increase the value of count by one */

            Refrigirator KitchenAid = new Refrigirator(Refrigirator.brand); /* Creating a new object */

            Refrigirator.rftimeon(); /* Calling the rftimeon() method from the Refrigirator class */

            Refrigirator.RefrigiratorVar(); /* Calling the RefrigiratorVar() method from the Refrigirator class */

            String ontimerf = Refrigirator.timeon(); /* Saves the return of the method into a string */

            int energyusedtotalrf = Refrigirator.energyused*Integer.parseInt(ontimerf); /* Calculating total energy used by device. */

            System.out.println(KitchenAid.getName() + " was on for " + ontimerf + " hours and used " + energyusedtotalrf + " units of energy, it is located in the " + Refrigirator.location); /* Prints an output to the users screen. */

            System.out.println(count + " Objects have been created."); /* Print out how many objects have been made */
            
            

        } else if (Home.indicator == "Speakers") {

            /* Start of Speakers code block */

            count ++; /* Increase the value of count by one */

            Speakers Bose = new Speakers(Speakers.brand); /* Creating a new object */

            Speakers.spkrtimeon(); /* Calling the spkrtimeon() method from the Speakers class */

            Speakers.SpeakersVar(); /* Calling the SpeakersVar() method from the Speakers class */

            String ontimespkr = Speakers.timeon(); /* Saves the return of the method into a string */

            int energyusedtotalspkr = Speakers.energyused*Integer.parseInt(ontimespkr); /* Calculating total energy used by device. */

            System.out.println(Bose.getName() + " were on for " + ontimespkr + " hours and used " + energyusedtotalspkr + " units of energy, it is located in the " + Speakers.location); /* Prints an output to the users screen. */

            System.out.println(count + " Objects have been created."); /* Print out how many objects have been made */
            
            

        } else if (Home.indicator == "HeatingAircon") {

            /* Start of Heating/Aircon code block */ 

            count ++; /* Increase the value of count by one */

            HeatingAircon Aircool = new HeatingAircon(HeatingAircon.brand); /* Creating a new object */

            HeatingAircon.htartimeon(); /* Calling the htartimeon() method from the HeatingAircon class */

            HeatingAircon.HeatingAirconVar(); /* Calling the HeatingAirconVar() method from the HeatingAircon class */

            String ontimehtar = HeatingAircon.timeon(); /* Saves the return of the method into a string */

            int energyusedtotalhtar = HeatingAircon.energyused*Integer.parseInt(ontimehtar); /* Calculating total energy used by device. */

            System.out.println(Aircool.getName() + " was on for " + ontimehtar + " hours and used " + energyusedtotalhtar + " units of energy, it is located in the " + HeatingAircon.location); /* Prints an output to the users screen. */

            System.out.println(count + " Objects have been created."); /* Print out how many objects have been made */

        }
        
    }
    
}
    
}
