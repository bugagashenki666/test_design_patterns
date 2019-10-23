package example.builder.ver2;

import java.util.List;

public class MixBand<T extends Participant> extends MusicBand<T> {

    public MixBand()
    {}

    public MixBand(String name) {
        super(name);
    }

    @Override
    public void doPerformance() {
        System.out.println(getName() + " dancing and singing for you");
        for(T m:super.getParticipants())
        {
            m.doAction();
        }
    }
}
