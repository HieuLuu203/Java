import java.util.*;

public class Vehicle {

    public Vehicle() {}

    protected int year, price;
    protected String ID, brand, color;

    public String getID() { return ID;}
    public void setID(String ID) { this.ID = ID;}

    public String getBrand() { return brand;}
    public void setBrand(String brand) { this.brand = brand;}

    public int getYear() { return year;}
    public void setYear(int year) { this.year = year;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public void showInfo()
    {
        System.out.println("ID: " + ID + "\nBrand: " + brand + "\nColor: " + color + "\nYear: " + year + "\nPrice: " + price +"$" );
    }
}
