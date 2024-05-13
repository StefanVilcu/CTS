package clase;

public class PachetCazare implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet ofera cazare");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Ati rezervat un pachet de cazare");
    }
}
