import example.builder.ver3.ComplexLunch;
import example.builder.ver3.Director;
import example.builder.ver3.ExtendedLunchBuilder;
import example.builder.ver3.StandardLunchBuilder;

public class MainBuilderVer3 {
    public static void main(String[] args) {
        ComplexLunch complexLunch1 = Director.createLunch(new StandardLunchBuilder());
        ComplexLunch complexLunch2 = Director.createLunch(new ExtendedLunchBuilder("salad caesar,truffled soup,beefsteak,beer,grape,pudding"));
        System.out.println(complexLunch1);
        System.out.println(complexLunch2);
    }
}
