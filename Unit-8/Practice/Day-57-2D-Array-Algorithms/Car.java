public class Car {
    private int odometer;

    public Car() {
        odometer = (int)(Math.random() * 1000);
    }

    public void drive(int miles) {
        odometer += miles;
    }

    public int getOdometer() { return odometer; }
}
