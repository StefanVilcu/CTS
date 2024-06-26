package SingletonThreadSafe;

public class AgentieThreadSafe {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    public AgentieThreadSafe(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

   private static AgentieThreadSafe instanta = null;
    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static synchronized AgentieThreadSafe getInstance(String nume, float capital, int numarAngajati){
        if(instanta == null)
            instanta = new AgentieThreadSafe(nume,capital,numarAngajati);
        return instanta;
    }
}
