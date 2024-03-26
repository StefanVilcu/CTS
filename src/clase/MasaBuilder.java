package clase;

public class MasaBuilder implements Builder {
    Masa masa;

    public MasaBuilder() {
        masa = new Masa(false,false,false,false,"N/A");
    }

    @Override
    public Masa build() {
        return masa;
    }

    public MasaBuilder setLaGeam(boolean laGeam)
    {
        this.masa.setLaGeam(laGeam);
        return this;
    }

    public MasaBuilder setScaunErgonomic(boolean scaunErgonomic)
    {
        this.masa.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public MasaBuilder setDecorata(boolean decorata)
    {
        this.masa.setDecorata(decorata);
        return this;
    }

    public MasaBuilder setMuzica(boolean muzica)
    {
        this.masa.setMuzica(muzica);
        return this;
    }

    public MasaBuilder setGenMuzica(String genMuzica)
    {
        this.masa.setGenMuzica(genMuzica);
        return this;
    }

}
