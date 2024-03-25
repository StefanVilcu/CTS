package BuilderV1;

public class PachetTransportBuilder implements Builder {
    private PachetTransport pT;

    public PachetTransportBuilder() {
        pT = new PachetTransport(false,false,false,false,false);
    }

    @Override
    public PachetTransport build() {
        return pT;
    }

    public PachetTransportBuilder setHasWiFi(boolean hasWiFi){
        this.pT.setHasWiFi(hasWiFi);
        return this;
    }
    public PachetTransportBuilder setHasAnimale(boolean hasAnimale){
        this.pT.setHasWiFi(hasAnimale);
        return this;
    }
    public PachetTransportBuilder setFumator(boolean isFumator) {
        this.pT.setFumator(isFumator);
        return this;
    }
    public PachetTransportBuilder setHasAC(boolean hasAC) {
        this.pT.setHasAC(hasAC);
        return this;
    }
    public PachetTransportBuilder setHasTV(boolean hasTV) {
        this.pT.setHasTV(hasTV);
        return this;
    }
}
