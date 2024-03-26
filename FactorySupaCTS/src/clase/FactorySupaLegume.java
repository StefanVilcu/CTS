package clase;

public class FactorySupaLegume implements Factory{
    @Override
    public Supa create() {
        return new SupaLegume();
    }
}
