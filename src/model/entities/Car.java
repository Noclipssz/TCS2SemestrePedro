package model.entities;

import java.util.ArrayList;

public class Car {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double mileage;
    private double price;


    public Car() {}

    public Car(int id, String make, String model, int year, String color, double mileage, double price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
