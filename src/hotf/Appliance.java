package hotf; /* Part of the HOTF package */

public abstract class Appliance {
    
    public static int energyused; /* This holds the energy used by each appliance */
    
    public static String energyusedhours; /* This holds how long each appliance is used for */
    
    public static int energyusedtotal; /* This holds the total energy used */
    
    public static String name; /* This holds the name of each appliance */
    
    public static String location; /* This holds the location that each appliance is stored */
    
    public static String brand; /* This holds the brand of each appliance */
    
    public static int id; /* This holds the id of each appliance */
    
    public static String indicator;
    
    
    /* This is the getter and setter block for my Appliance Properties */

    public int getEnergyused() {
        return energyused;
    }

    public void setEnergyused(int energyused) {
        this.energyused = energyused;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    
     public String getenergyusedhours() {
        return energyusedhours;
    }

    public void setenergyusedhours(String energyusedhours) {
        this.energyusedhours = energyusedhours;
    }
    
    public int getenergyusedtotal() {
        return energyusedtotal;
    }

    public void setenergyusedtotal(int energyusedtotal) {
        this.energyusedtotal = energyusedtotal;
    }
    
     public String getindicator() {
        return indicator;
    }

    public void setindicator(String indicator) {
        this.indicator = indicator;
    }
        
}
