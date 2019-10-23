package example.builder.ver3;

public class StandardLunchBuilder extends LunchBuilder {
    @Override
    public void buildSalad() {
        this.getLunch().dish.add("vinegret");
    }

    @Override
    public void buildFirstDish() {
        this.getLunch().dish.add("borsch");
    }

    @Override
    public void buildSecondDish() {
        this.getLunch().dish.add("doshirak");
    }

    @Override
    public void buildDrink() {
        this.getLunch().dish.add("tea");
    }

    @Override
    public void buildAddons() {

    }
}
