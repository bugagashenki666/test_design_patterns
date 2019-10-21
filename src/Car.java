public class Car {
    private String model;
    private int numberOfWheels;
    private String brand;
    private boolean serial;
    public Car() {
        this.numberOfWheels = 4;
        this.serial = false;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isSerial() {
        return serial;
    }

    public void setSerial(boolean serial) {
        this.serial = serial;
    }

    public Car(String model, int numberOfWheels, String brand) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public Car(String model, int numberOfWheels, String brand, boolean serial) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", brand='" + brand + '\'' +
                ", serial=" + serial +
                '}';
    }
}
