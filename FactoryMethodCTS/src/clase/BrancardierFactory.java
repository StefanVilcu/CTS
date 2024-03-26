package clase;

public class BrancardierFactory implements Factory{
    @Override
    public PersonalMedical create() {
        return new Brancardier();
    }
}
