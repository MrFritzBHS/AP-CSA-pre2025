public class Car extends Vehicle{
    private int year;
    private String make;
    private String model;
    
    public Car(int year, String make, String model, String fuelType) {
        super(fuelType, 4);
        this.year = year;
        this.make = make;
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getMode() {
        return model;
    }
}
