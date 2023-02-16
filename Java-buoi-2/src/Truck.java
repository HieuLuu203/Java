public class Truck extends Vehicle {
    private int weight;

    public int getWeight() { return weight;}
    public void setWeight(int weight) { this.weight = weight;}

    public void showInfo()
    {
        super.showInfo();
        System.out.println ("Weight: " + weight +"kg");
    }
}
