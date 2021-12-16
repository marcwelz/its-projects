public class application {

    /**
     * @Author Welz Marc
     * @Version 10.11.2020
     */

    public static void main(String[] args) {

        Goenner [] goenners = new Goenner[] {
                new Goenner("max", new Ausweis(false, 28)),
                new Goenner("michi", new Ausweis(true, 268)),
                new Goenner("hans", new Ausweis(true, 68))
        };

        Rega rega = new Rega("REGA", goenners);

        rega.toString();

        try {
            System.out.println(rega.getAusweis(0));
            System.out.println(rega.getAusweis(1));

            System.out.println(rega.getAusweis(10));
        } catch (Exception e) {
            System.out.println("\nIndex zu Hoch");
            System.out.println("die Höchste mögliche Zahl beträgt: " +
                            rega.getAusweis().length);
            //e.printStackTrace();
        }
    }
}
