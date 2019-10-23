package example.builder.ver3;

public class Director {
    public static ComplexLunch createLunch(LunchBuilder lunchBuilder)
    {
        lunchBuilder.buildSalad();
        lunchBuilder.buildFirstDish();
        lunchBuilder.buildSecondDish();
        lunchBuilder.buildDrink();
        lunchBuilder.buildAddons();
        return lunchBuilder.getLunch();
    }
}
