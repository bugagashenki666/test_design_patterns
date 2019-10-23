package example.builder.ver3;

import java.util.LinkedList;
import java.util.List;

public class ComplexLunch {
    List<String> dish;

    @Override
    public String toString() {
        return "ComplexLunch{" +
                "dish=" + dish +
                '}';
    }

    public ComplexLunch() {
        dish = new LinkedList<>();
    }
}
