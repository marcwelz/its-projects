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
    };
    private Goenner[] goenner;

    public Rega(String anschrift, Goenner[] goenner) {
        this.anschrift = anschrift;
        this.goenner = goenner;
    }

    public String toString() {
        System.out.println("toString methode");
        return null;
    }

    public String getAnschrift() {
        return anschrift;
    }

    public Ausweis[] getAusweis() {
        return ausweis;
    }

    public Goenner[] getGoenner() {
        return goenner;
    }

    public Ausweis getAusweis(int index) {
        return ausweis[index];
    }
}