package example.builder.ver3;

public abstract class LunchBuilder {
    protected ComplexLunch lunch;

    public LunchBuilder() {
        lunch = new ComplexLunch();
    }

    public ComplexLunch getLunch() {
        return lunch;
    }

    public abstract void buildSalad();
    public abstract void buildFirstDish();
    public abstract void buildSecondDish();
    public abstract void buildDrink();
    public abstract void buildAddons();
}
