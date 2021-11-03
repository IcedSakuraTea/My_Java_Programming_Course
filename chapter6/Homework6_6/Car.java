import java.util.*;

public class Car {
    public int speed;
    public int mileage;
    public String color;
    public String brand;

    public Car() {
        speed = 0;
        mileage = 0;
        color = "NoColor";
        brand = "NoBrand";
    }

    public Car(int speed, int mileage, String color, String brand) {
        this.speed = speed;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public boolean setSpeed(int speed) {
        this.speed = speed;
        return true;
    }

    public boolean setMileage(int mileage) {
        this.mileage = mileage;
        return true;
    }

    public boolean setColor(String color) {
        this.color = color;
        return true;
    }

    public boolean setBrand(String brand) {
        this.brand = brand;
        return true;
    }

    public boolean setCar(String color, String brand) {
        boolean isValid = true;
        isValid = setColor(color) && setBrand(brand);
        return isValid;

    }

    public boolean setCar(int speed, int mileage, String color, String brand) {
        boolean isValid = true;
        isValid = setSpeed(speed) && setMileage(mileage) && setColor(color) && setBrand(brand);
        return isValid;
    }

    public boolean setColor(String color, String speed) {
        boolean isValid = true;
        isValid = setColor(color) && setBrand(brand);
        return isValid;

    }

    public boolean setColor(int speed, int mileage, String color, String brand) {
        boolean isValid = true;
        isValid = setSpeed(speed) && setMileage(mileage) && setColor(color) && setBrand(brand);
        return isValid;
    }
}