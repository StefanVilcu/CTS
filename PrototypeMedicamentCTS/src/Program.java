import clase.Medicament;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[]args)
    {
        List<String> ingrediente = new ArrayList<>();
        ingrediente.add("taurina");
        ingrediente.add("benzina");
        ingrediente.add("nebunie");
        ingrediente.add("wow");
        ingrediente.add("Banel");


        Medicament m1 = new Medicament(ingrediente);
        Medicament m2 = new Medicament(ingrediente);
        Medicament m3 = new Medicament(ingrediente);

        m1.adaugaIngredient("Horia");
        m2 = m1.copiaza();
        m1.adaugaIngredient("Buzarin");
        m3.adaugaIngredient("Gigiii");


        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
    }

}
