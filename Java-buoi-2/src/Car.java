public class Car extends Vehicle{
    public Car () {}
    private String engineType;
    private int seatNumbers;

    public String getEngineType() {
        return engineType;
    }

    public int getSeatNumbers() {
        return seatNumbers;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setSeatNumbers(int seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public void showInfo()
    {
        super.showInfo();
        System.out.println ("Engine type: " + engineType);
        System.out.println("Numbers of seat: " + seatNumbers);
    }
}
