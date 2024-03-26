import clase.Factory;
import clase.MedicFactory;
import clase.PersonalMedical;

public class Program {

    public static void afisare(Factory fabricuta){
        PersonalMedical personalMedical = fabricuta.create();
        personalMedical.descrie();
    }

    public static void main(String[]args){
        afisare(new MedicFactory());
    }

}
