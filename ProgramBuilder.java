import BuilderV1.PachetTransport;
import BuilderV1.PachetTransportBuilder;
public class Program {
    public static void main(String[] args){
        PachetTransport pachetTransport = new PachetTransportBuilder().setHasAC(true).setHasTV(true).build();
        System.out.println(pachetTransport.toString());
    }
}

