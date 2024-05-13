package clase;

public class Hotel {
    String numeHotel;

    public Hotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public String getNumeHotel() {
        return numeHotel;
    }

    public void setNumeHotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "numeHotel='" + numeHotel + '\'' +
                '}';
    }

    public void rezervaCamera(String oras)
    {
        System.out.println("In hotelul " + this.numeHotel +" din orasul " + oras + " se rezerva o camera.");
    }
}
