package com.bbw.mw.weihnachtsmarkt;

/**
 * @Author Welz Marc
 * @Version 08.12.2020
 */

public class Bewohner {

    private String beruf;
    private int alter;
    private int id;

    public Bewohner(String beruf, int alter, int id) {
        this.beruf = beruf;
        this.alter = alter;
        this.id = id;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = Integer.parseInt(alter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "ToString methode Bewohner";
    }
}
