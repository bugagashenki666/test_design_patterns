package example.builder.ver2;

import java.util.List;

public class SingingBand<T extends Participant> extends MusicBand<T> {
    @Override
    public void doPerformance() {
        System.out.println(this.name + " singing for you.");
        for(T m:this.getParticipants())
        {
            m.doAction();
        }
    }
    public SingingBand()
    {

    }

    public SingingBand(String name) {
        super(name);
    }
}
