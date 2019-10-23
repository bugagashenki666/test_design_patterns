package example.builder.ver3;

public class ExtendedLunchBuilder extends LunchBuilder{
    String[] ext;
    public ExtendedLunchBuilder(String ext) {
        this.ext = ext.split("[,]{1}");
    }

    @Override
    public void buildSalad() {
        this.lunch.dish.add(ext[0]);
    }

    @Override
    public void buildFirstDish() {
        this.lunch.dish.add(ext[1]);
    }

    @Override
    public void buildSecondDish() {
        this.lunch.dish.add(ext[2]);
    }

    @Override
    public void buildDrink() {
        this.lunch.dish.add(ext[3]);
    }

    @Override
    public void buildAddons() {
        for (int i = 4 ; i < ext.length ; i++)
        {
            this.lunch.dish.add(ext[i]);
        }
    }
}
