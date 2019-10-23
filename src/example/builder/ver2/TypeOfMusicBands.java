package example.builder.ver2;

public  enum TypeOfMusicBands {
    DANCING("dancing"),SINGING("singing"),MIX("mix");

    private  String value;

    TypeOfMusicBands(String value) {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
    public static TypeOfMusicBands getValueFromString(String type)
    {
        switch (type)
        {
            case "dancing": return DANCING;
            case "singing": return SINGING;
            case "mix": return MIX;
            default: return SINGING;
         }
    }
}
