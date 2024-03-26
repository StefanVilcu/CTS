package clase;

public class AsistentFactory implements Factory {
    @Override
    public PersonalMedical create() {
        return new Asistent();
    }
}
