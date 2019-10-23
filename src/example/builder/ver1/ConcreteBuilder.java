package example.builder.ver1;

import example.builder.ver1.Builder;

public class ConcreteBuilder implements Builder {
    private Car car = new Car();

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void buildBrand(String brand) {
        car.setBrand(brand);
    }

    @Override
    public void buildModel(String model) {
        car.setModel(model);
    }

    @Override
    public void buildSerial(boolean serial) {
        car.setSerial(serial);
    }

    @Override
    public void buildNumOfWheels(int num) {
        car.setNumberOfWheels(num);
    }
}
