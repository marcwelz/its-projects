public class Goenner {

    /**
     * @Author Welz Marc
     * @Version 10.11.2020
     */

    private String name;
    private Ausweis ausweis;

    public Goenner(String name, Ausweis ausweis) {
        this.name = name;
        this.ausweis = ausweis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ausweis getAusweis() {
        return ausweis;
    }

    public void setAusweis(Ausweis ausweis) {
        this.ausweis = ausweis;
    }
}