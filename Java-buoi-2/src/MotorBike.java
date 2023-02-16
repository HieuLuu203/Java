public class MotorBike extends Vehicle {
    public MotorBike() {}

    private int power;

    public int getPower() { return power;}
    public void setPower(int power) { this.power = power;}

    public void showInfo()
    {
        super.showInfo();
        System.out.println ("Power: " + power);
    }
}
