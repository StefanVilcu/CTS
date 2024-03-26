package clase;

public class FactorySupaVitel implements Factory{
    @Override
    public Supa create() {
        return new SupaVitel();
    }
}
