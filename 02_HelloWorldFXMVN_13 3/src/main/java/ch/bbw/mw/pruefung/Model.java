package ch.bbw.mw.pruefung;

public class Model {

    private double franken;
    private double euro = 0.88;
    private double pfund = 0.787;
    private double dollar = 1.09;

    public Model(double franken, double euro, double pfund) {
        this.franken = franken;
        this.euro = euro;
        this.pfund = pfund;
    }

    public Model(double franken) {
        this.franken = franken;
    }

    public double handlePfund() {
        return franken*pfund;
    }

    public double handleEuro() {
        return franken*euro;
    }

    public double handleDollar() {
        return franken*dollar;
    }
}
