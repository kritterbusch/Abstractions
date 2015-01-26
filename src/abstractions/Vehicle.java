package abstractions;

public class Vehicle {

    private String vehicleType;

    public Vehicle(String t) {
        vehicleType = t;
    }


    public String getVehicleType() {
        return vehicleType;
    }
    
    @Override
    public String toString()
    {
        String str = "My first " + vehicleType + " was a "; 
        return str;
    }

}
