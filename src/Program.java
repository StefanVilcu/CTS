import clase.Masa;
import clase.MasaBuilder;

public class Program {
    public static void main()
    {
        Masa m1 = new MasaBuilder().setScaunErgonomic(true).setLaGeam(true).setMuzica(true).setGenMuzica("HipHop").build();
        System.out.println(m1.toString());
    }

}
