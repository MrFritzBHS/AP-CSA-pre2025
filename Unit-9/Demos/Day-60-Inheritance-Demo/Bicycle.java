public class Bicycle extends Vehicle{
    private String type;
    private int speeds;
    
    public Bicycle(String type, int speeds) {
        super("none", 2);
        this.type = type;
        this.speeds = speeds;
    }
    
    public int getSpeeds() {
        return speeds;
    }
    
    public String getType() {
        return type;
    }
}
