package clase;

public class Zbor {
    CompanieAeriana companieAeriana;
    String orasPlecare;
    String orasDestinatie;

    public Zbor(CompanieAeriana companieAeriana, String orasPlecare, String orasDestinatie) {
        this.companieAeriana = companieAeriana;
        this.orasPlecare = orasPlecare;
        this.orasDestinatie = orasDestinatie;
    }

    public CompanieAeriana getCompanieAeriana() {
        return companieAeriana;
    }

    public void setCompanieAeriana(CompanieAeriana companieAeriana) {
        this.companieAeriana = companieAeriana;
    }

    public String getOrasDestinatie() {
        return orasDestinatie;
    }

    public void setOrasDestinatie(String orasDestinatie) {
        this.orasDestinatie = orasDestinatie;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "companieAeriana=" + companieAeriana +
                ", orasPlecare='" + orasPlecare + '\'' +
                ", orasDestinatie='" + orasDestinatie + '\'' +
                '}';
    }
}
