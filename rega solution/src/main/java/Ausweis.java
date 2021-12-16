public class Ausweis {

    /**
     * @Author Welz Marc
     * @Version 10.11.2020
     */

    private boolean isFamily;
    private int mitgliedNummer;

    public Ausweis(boolean isFamily, int mitgliedNummer) {
        this.isFamily = isFamily;
        this.mitgliedNummer = mitgliedNummer;
    }

    public boolean isFamily() {
        return isFamily;
    }

    public void setFamily(boolean family) {
        isFamily = family;
    }

    public int getMitgliedNummer() {
        return mitgliedNummer;
    }

    public void setMitgliedNummer(int mitgliedNummer) {
        this.mitgliedNummer = mitgliedNummer;
    }
}