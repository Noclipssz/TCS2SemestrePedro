package Class;

import java.util.ArrayList;

public class CarClass {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double mileage;
    private double price;

    ArrayList<CarClass> carList = new ArrayList<CarClass>();

    public CarClass(int id, String make, String model, int year, String color, double mileage, double price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }
}
