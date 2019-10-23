import example.builder.ver2.Director;
import example.builder.ver2.MusicBand;

public class MainBuilderVer2 {
    public static void main(String[] args) {
        Director director = new Director();
        MusicBand mb = director.construct("Limp Bizkit;singing;Fred Durst:lead vocals|John Otto:bas:backing vocals|Sam Rivers:drums:percussion|Wes Borland:guitars:vocals|DJ Lethal:turntables");
        mb.doPerformance();
        System.out.println(mb.toString());
        Director director1 = new Director();
        MusicBand mb2 = director.construct("Кар-Мэн;mix;Сергей Лемох:вокал:тексты:аранжировки:танцы:хореография|Алексей Макаров:танцы|Анастасия Ерофеева:танцы|Виолетта Петросян:танцы");
        mb2.doPerformance();
        System.out.println(mb2.toString());
    }
}
