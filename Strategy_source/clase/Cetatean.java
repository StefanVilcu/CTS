package clase;

public class Cetatean {
    String nume;
    Cetatenie cetatenie;

    public void functie(){
        this.cetatenie.cetatenie(this.nume);
    }

    public Cetatean(String nume, Cetatenie cetatenie) {
        super();
        this.nume = nume;
        this.cetatenie = cetatenie;
    }

    public Cetatean(String nume) {
        super();
        this.nume = nume;
        this.cetatenie = new CetateanUE();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Cetatenie getCetatenie() {
        return cetatenie;
    }

    public void setCetatenie(Cetatenie cetatenie) {
        this.cetatenie = cetatenie;
    }
}
