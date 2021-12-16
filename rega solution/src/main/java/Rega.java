public class Rega {

    /**
     * @Author Welz Marc
     * @Version 10.11.2020
     */

    private String anschrift;
    private Ausweis[] ausweis = new Ausweis[] {
            new Ausweis(true, 2),
            new Ausweis(false, 22),
            new Ausweis(true, 43),
            new Ausweis(false, 221),
            null
    };
    private Goenner[] goenner;

    public Rega(String anschrift) {
        this.anschrift = anschrift;
    }

    public String toString() {
        System.out.println("toString methode");
        return null;
    }

    public void setMitglieder(Goenner[] goenner) {
        this.goenner = goenner;

        for(int i = 0; i < goenner.length; i++) {
            goenner[i].setAusweis(ausweis[i]);
        }
    }

    public Ausweis[] getAusweis() {
        return ausweis;
    }

    public Ausweis getAusweis(int index) throws Exception {
        if (ausweis[index] == null) {
            throw new Exception();
        }
        return ausweis[index];
    }
}