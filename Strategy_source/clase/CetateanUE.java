package clase;

public class CetateanUE implements Cetatenie{
    @Override
    public void cetatenie(String nume) {
        System.out.println();
        System.out.println(nume + " este un cetatean UE");
        System.out.println("Oferiti documentele necesare");
    }
}
