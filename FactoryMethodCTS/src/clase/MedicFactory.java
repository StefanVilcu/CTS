package clase;

public class MedicFactory implements Factory{
    @Override
    public PersonalMedical create() {
        return new Medic();
    }
}
