package example.builder.ver2;

import java.util.LinkedList;
import java.util.List;

public abstract class MusicBand<T extends Participant> {
    public String name;
    public List<T> participants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    public void setParticipants(List<T> participants) {
        this.participants = participants;
    }

    public void addParticipant(T participant) {
        this.participants.add(participant);
    }

    public MusicBand(String name) {
        this.name = name;
        this.participants = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }

    public MusicBand() {
        this.participants = new LinkedList<>();
    }

    public abstract void doPerformance();
}
