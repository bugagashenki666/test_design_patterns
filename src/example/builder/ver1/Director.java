package example.builder.ver1;

import example.builder.ver1.Builder;
import example.builder.ver1.ConcreteBuilder;

public class Director {
    public Car construct(String params)
    {
        String[] args = params.split(";");
        Builder builder = new ConcreteBuilder();
        builder.buildBrand(args[0]);
        builder.buildModel(args[1]);
        builder.buildNumOfWheels(Integer.valueOf(args[2]));
        builder.buildSerial(Boolean.valueOf(args[3]));
        return builder.getCar();
    }
}
