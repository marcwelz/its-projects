import sun.awt.image.ImageAccessException;

public class Application {

    /**
     * @Author Welz Marc
     * @Version 10.11.2020
     */

    private Rega rega;
    private Goenner[] goenner;

    public static void main(String[] args) {
        Application myApp = new Application();

        myApp.goenner = new Goenner[] {
                new Goenner("Max"),
                new Goenner("Michi"),
                new Goenner("Hans")
        };

        myApp.rega = new Rega("Rega");

        myApp.rega.setMitglieder(myApp.goenner);
        myApp.rega.toString();

        try {
            System.out.println(myApp.rega.getAusweis(0));
            System.out.println(myApp.rega.getAusweis(1));

            System.out.println(myApp.rega.getAusweis(10));
        } catch (Exception e) {
            System.out.println("\nIndex zu Hoch");
            System.out.println("die Höchste mögliche Zahl beträgt: " +
                            myApp.rega.getAusweis().length);
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
