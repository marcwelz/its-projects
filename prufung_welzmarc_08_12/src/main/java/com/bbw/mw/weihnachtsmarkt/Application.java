package com.bbw.mw.weihnachtsmarkt;

/**
 * @Author Welz Marc
 * @Version 08.12.2020
 */

public class Application {

    private Bewohner[] besucher;
    private Weihnachtsmarkt weihnachtsmarkt;
    private Bewohner besitzer;

    public static void main(String[] args) {
        Application myApp = new Application();

        myApp.besitzer = new Bewohner("Verkaufer", 34, 7);

        myApp.besucher = new Bewohner[] {
                new Bewohner("Informatiker", 22, 1),
                new Bewohner("Lehrer", 34, 2),
                new Bewohner("Polizist", 30, 3),
                new Bewohner("Lokomotivführer", 65,4),
                new Bewohner("Elektriker", 33, 5),
                new Bewohner("Mechaniker", 43, 6)
        };

        myApp.weihnachtsmarkt = new Weihnachtsmarkt("Thayngen", 100);
        myApp.weihnachtsmarkt.setBesucher(myApp.besucher);
        myApp.weihnachtsmarkt.setBesitzer(myApp.besitzer); // keine Ahnung was falsch ist

        try{
            myApp.besucher[1].setAlter("zehn");
        } catch (Exception e) {
            System.out.println("Fehler beim setzen des Alters! Nachricht: " + e.getMessage());
        }

    }
}
