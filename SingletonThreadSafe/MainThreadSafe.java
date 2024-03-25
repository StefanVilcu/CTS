package SingletonThreadSafe;

public class MainThreadSafe {
    public static void main(String[] args) {
        // Creating instances of AgentieThreadSafe
        AgentieThreadSafe agentie1 = AgentieThreadSafe.getInstance("Agentie1", 10000, 5);
        AgentieThreadSafe agentie2 = AgentieThreadSafe.getInstance("Agentie2", 20000, 10);

        // Displaying information about the agencies
        System.out.println("Agentie 1:");
        System.out.println("Nume: " + agentie1.getNumeAgentie());
        System.out.println("Capital: " + agentie1.getCapital());
        System.out.println("Numar angajati: " + agentie1.getNumarAngajati());

        System.out.println("\nAgentie 2:");
        System.out.println("Nume: " + agentie2.getNumeAgentie());
        System.out.println("Capital: " + agentie2.getCapital());
        System.out.println("Numar angajati: " + agentie2.getNumarAngajati());
    }
}
