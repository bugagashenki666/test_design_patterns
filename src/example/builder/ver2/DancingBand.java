package example.builder.ver2;

import java.util.List;

public class DancingBand<T extends Participant> extends MusicBand<T> {
    public DancingBand(String name) {
        super(name);
    }
    public DancingBand(){}

    @Override
    public void doPerformance() {
        System.out.println(getName() + " dancing for you");
        for(T m:super.getParticipants())
        {
            m.doAction();
        }
    }
}
