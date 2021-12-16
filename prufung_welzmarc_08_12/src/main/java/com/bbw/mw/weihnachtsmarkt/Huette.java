package com.bbw.mw.weihnachtsmarkt;

/**
 * @Author Welz Marc
 * @Version 08.12.2020
 */

public class Huette {

    private String thema;
    private Bewohner[] angestellte;
    private Bewohner besitzer;
    private int flaeche;

    public Huette(String thema, int flaeche) {
        this.thema = thema;
        this.flaeche = flaeche;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public Bewohner[] getAngestellte() {
        return angestellte;
    }

    public void setAngestellte(Bewohner[] angestellte) {
        this.angestellte = angestellte;
    }

    public Bewohner getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Bewohner besitzer) {
        this.besitzer = besitzer;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public String toString() {
        return "ToString methode Huette";
    }
}
