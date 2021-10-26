public class Car {
    public int speed;
    public int mileage;
    public String color;
    public String brand;

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
        this.color = color;
        this.brand = brand;
        return true;
    }

    public boolean setCar(int speed, int mileage, String color, String brand) {
        this.speed = speed;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
        return true;
    }
}