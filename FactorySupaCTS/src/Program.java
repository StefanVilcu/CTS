import clase.Factory;
import clase.FactorySupaCiuperci;
import clase.Supa;

public class Program {

    public static void afisare(Factory fabricuta){
        Supa supa = fabricuta.create();
        supa.descrie();
    }
    public static void main(String[]args){
       afisare(new FactorySupaCiuperci());
    }
}
