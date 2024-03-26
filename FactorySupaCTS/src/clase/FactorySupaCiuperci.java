package clase;

public class FactorySupaCiuperci implements Factory{
    @Override
    public Supa create() {
        return new SupaCiuperci();
    }
}
