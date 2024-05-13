package clase;

import inchiriere_masini.MasinaInchiriata;

public class PachetMasinaInchiriata implements PachetTuristic{

    private MasinaInchiriata masinaInchiriata;

    public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descriere() {
        System.out.println("Acest pachet ofera masina de inchiriat");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Ati rezervat un pachet de inchiriere masini");
    }
}
