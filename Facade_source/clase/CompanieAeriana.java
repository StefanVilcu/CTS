package clase;

public class CompanieAeriana {
    String denumire;

    public CompanieAeriana(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "CompanieAeriana{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
    public Zbor rezervaBiletAvion(String plecare, String destinatie){
        Zbor zbor = new Zbor(this, plecare, destinatie);
        return zbor;
    }
}
