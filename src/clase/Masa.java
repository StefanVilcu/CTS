package clase;

public class Masa {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private boolean decorata;
    private boolean muzica;
    private String genMuzica;

    public Masa(boolean laGeam, boolean scaunErgonomic, boolean decorata, boolean muzica, String genMuzica) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorata = decorata;
        this.muzica = muzica;
        this.genMuzica = genMuzica;
    }

    public Masa() {
    }

    public boolean isLaGeam() {
        return laGeam;
    }

    public void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isDecorata() {
        return decorata;
    }

    public void setDecorata(boolean decorata) {
        this.decorata = decorata;
    }

    public boolean isMuzica() {
        return muzica;
    }

    public void setMuzica(boolean muzica) {
        this.muzica = muzica;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("laGeam=").append(laGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", decorata=").append(decorata);
        sb.append(", muzica=").append(muzica);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
