import clase.Cetatean;
import clase.CetateanAmerican;

public class Program {
    public static void main(String args[]){
        Cetatean cetatean = new Cetatean("Filip");

        cetatean.functie();

        cetatean.setCetatenie(new CetateanAmerican());
        cetatean.functie();
    }
}
