package example.builder.ver2;

public class Director {
    private BaseBuilder builder = null;
    public MusicBand<Participant> construct(String source)
    {
        String args[] = source.split("[;]{1}");
        builder = new ConcreteBuilder(TypeOfMusicBands.getValueFromString(args[1]));
        builder.buildName(args[0]);
        builder.buildParticipants(args[2]);
        return builder.getMusicBand();
    }
}
