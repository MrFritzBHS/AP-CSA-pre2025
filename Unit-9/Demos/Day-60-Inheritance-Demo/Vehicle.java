public class Vehicle {
    private String fuelType;
    private int numWheels;
    
    public Vehicle(String fuelType, int numWheels) {
        this.fuelType = fuelType;
        this.numWheels = numWheels;
    }
    
    public int getNumWheels() {
        return numWheels;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public String toString() {
        return "Vehicle: " + numWheels + "-wheels, fuelType - " + fuelType;
    }
}
