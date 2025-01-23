class PinballMachine {

    private int year;
    private String title;
    private String maker;

    public PinballMachine(int year, String title, String maker) {
        this.year = year;
        this.title = title;
        this.maker = maker;
    }

    public PinballMachine(PinballMachine otherMachine) {
        this.year = otherMachine.getYear();
        this.maker = otherMachine.getMaker();
        this.title = otherMachine.getTitle();
    }

    public int getYear() { return this.year; }
    public String getTitle() { return this.title; }
    public String getMaker() { return this.maker; }

    public void setTitle(String newTitle) { this.title = newTitle; }

    public String toString() {
        return title + ": " + year + " by " + maker;
    }
}
