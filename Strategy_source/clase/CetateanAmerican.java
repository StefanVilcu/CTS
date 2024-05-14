package clase;

public class CetateanAmerican implements Cetatenie{
    @Override
    public void cetatenie(String nume) {
        System.out.println();
        System.out.println(nume + " este un cetatean american");
        System.out.println("Oferiti documentele necesare");
    }
}
