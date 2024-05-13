package clase;

public class Facade {
    public void rezervaSejur(String orasPlecare, String orasDestinatie){
        CompanieAeriana companieAeriana = new CompanieAeriana("SknAirlines");
        Zbor zborDus = new Zbor(companieAeriana,orasPlecare,orasDestinatie);
        Zbor zborIntors = new Zbor(companieAeriana,orasDestinatie,orasPlecare);

        Hotel hotel = new Hotel("INS Hotel 98");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(orasDestinatie);
    }
}
