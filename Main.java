import cts.stefan.vilcu.prototype.Jucator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> medicamente = new ArrayList<>();
        medicamente.add("Taurina");
        medicamente.add("Benzina");
        medicamente.add("Nenorociri");
        medicamente.add("Simona Halep");

        List<String> antrenamentePortar = new ArrayList<>();
        antrenamentePortar.add("Plonjeuri");
        antrenamentePortar.add("Degajari");
        antrenamentePortar.add("Izometrie");
        antrenamentePortar.add("Genuflexiuni");

        List<String> antrenamenteFundas = new ArrayList<>();
        antrenamenteFundas.add("Tackling");
        antrenamenteFundas.add("Interceptie");
        antrenamenteFundas.add("Lovitura de cap");
        antrenamenteFundas.add("Pasa lunga");

        List<String> antrenamenteMijlocas = new ArrayList<>();
        antrenamenteMijlocas.add("Pasa scurta");
        antrenamenteMijlocas.add("Pasa lunga");
        antrenamenteMijlocas.add("Alunecare");
        antrenamenteMijlocas.add("Pasa filtranta");

        List<String> antrenamenteAtacant = new ArrayList<>();
        antrenamenteAtacant.add("Sut");
        antrenamenteAtacant.add("Penalty");
        antrenamenteAtacant.add("Sprint");
        antrenamenteAtacant.add("Corner");

        Jucator j1 = new Jucator(antrenamenteAtacant, medicamente,"atacant",9);
        Jucator j2 = new Jucator(antrenamenteAtacant, medicamente,"atacant",11);
        Jucator j3 = new Jucator(antrenamenteFundas, medicamente,"fundas",4);

        j2.adaugaAntrenament("dribbling");
        j3.adaugaMedicament("Lorazepam");

        System.out.println(j1.toString());
        System.out.println(j2.toString());
        System.out.println(j3.toString());
    }
}
