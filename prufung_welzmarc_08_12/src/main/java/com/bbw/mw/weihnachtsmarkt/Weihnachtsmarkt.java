package com.bbw.mw.weihnachtsmarkt;

/**
 * @Author Welz Marc
 * @Version 08.12.2020
 */

public class Weihnachtsmarkt {

    private String ortschaft;
    private int maxBesucher;
    private Huette[] huetten = new Huette[] {
            new Huette("Hot Dog", 200),
            new Huette("Hamburger", 350),
            new Huette("Schiessstand", 420),
            null
    };
    private Bewohner[] besucher;

    public Weihnachtsmarkt(String ortschaft, int maxBesucher) {
        this.ortschaft = ortschaft;
        this.maxBesucher = maxBesucher;
    }

    public String getOrtschaft() {
        return ortschaft;
    }

    public void setOrtschaft(String ortschaft) {
        this.ortschaft = ortschaft;
    }

    public Huette[] getHuetten() {
        return huetten;
    }

    public void setHuetten(Huette[] huetten) {
        this.huetten = huetten;

    }

    public Bewohner[] getBesucher() {
        return besucher;
    }

    public void setBesucher(Bewohner[] besucher) {
        this.besucher = besucher;
        for(int i = 0; i < huetten.length; i++) {
            huetten[i].setAngestellte(besucher);
        }
    }

    public void setBesitzer(Bewohner besitzer) {
        huetten[0].setBesitzer(besitzer);
    }

    public String toString() {
        return "ToString methode Weihnachtsmarkt";
    }

    public void toString2() {
        System.out.println("Weihnachtsmarkt " + ortschaft);
        for(int i = 0; i < huetten.length; i++) {
            System.out.println("Thema: " + huetten[i].getThema());
            System.out.println("Angestellte: " + huetten[i].getAngestellte());
            System.out.println("Besitzer: " + huetten[i].getBesitzer());
            System.out.println("Fläche: " + huetten[i].getFlaeche());
        }

    }
}
