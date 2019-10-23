package example.builder.ver2;

import java.util.List;

public class ConcreteBuilder implements BaseBuilder{
    MusicBand<Participant> band;
    public ConcreteBuilder(TypeOfMusicBands type) {
        switch(type)
        {
            case DANCING:
                band=new DancingBand<>();
                break;
            case MIX:
                band = new MixBand<>();
                break;
            case SINGING:
                band = new SingingBand<>();
                break;
        }
    }

    @Override
    public MusicBand<Participant> getMusicBand() {
        return band;
    }

    @Override
    public void buildName(String name) {
        band.setName(name);
    }

    @Override
    public void buildParticipants(String participants) {
        String args[] = participants.split("[|]{1}");
        for(int i = 0 ; i < args.length ; i++)
        {
            String params[] = args[i].split("[:]{1}");
            Participant participant = new Participant(params[0]);
            for(int j = 1 ; j < params.length ; j++)
            {
                participant.addAction(params[j]);
            }
            band.addParticipant(participant);
        }
    }
}
