package example.builder.ver2;

import java.util.List;

import static example.builder.ver2.TypeOfMusicBands.DANCING;

public interface BaseBuilder {
    public  MusicBand<Participant> getMusicBand();
    public abstract void buildName(String name);
    public abstract void buildParticipants(String participants);
}
