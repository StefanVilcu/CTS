package cts.stefan.vilcu.prototype;

import cts.stefan.vilcu.prototype.IJucator;

import java.util.ArrayList;
import java.util.List;

public class Jucator implements IJucator {
    List<String> antrenamente;
    List<String> medicamente;
    String disciplina;
    int nrPeTricou;

    public Jucator(List<String> antrenamente, List<String> medicamente, String disciplina, int nrPeTricou) {
        this.antrenamente = new ArrayList<String>(antrenamente);
        this.medicamente = medicamente;
        this.disciplina = disciplina;
        this.nrPeTricou = nrPeTricou;
    }

    public Jucator() {
        antrenamente = new ArrayList<>();
        medicamente = new ArrayList<>();
    }

    public List<String> getAntrenamente() {
        return antrenamente;
    }

    public void setAntrenamente(List<String> antrenamente) {
        this.antrenamente = antrenamente;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }

    public void setMedicamente(List<String> medicamente) {
        this.medicamente = medicamente;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public IJucator copiaza() {
        List<String> copiedAntrenamente = new ArrayList<>(this.antrenamente);
        List<String> copiedMedicamente = new ArrayList<>(this.medicamente);

        return new Jucator(copiedAntrenamente, copiedMedicamente, this.disciplina, this.nrPeTricou);
    }

    @Override
    public void adaugaMedicament(String medicament) {
        this.medicamente.add(medicament);
    }

    @Override
    public void adaugaAntrenament(String antrenament) {
        this.antrenamente.add(antrenament);
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "antrenamente=" + antrenamente +
                ", medicamente=" + medicamente +
                ", disciplina='" + disciplina + '\'' +
                ", nrPeTricou=" + nrPeTricou +
                '}';
    }
}
