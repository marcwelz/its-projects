import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {

        System.out.println("Aufgabe 1 ------------------");
        List<City> cities = new ArrayList<>();

        List<City> list2 = Arrays.asList(
                new City("Basel", 220000),
                new City("Winterthur", 100000),
                new City("Schaffhausen", 34000),
                new City("Thayngen", 7200)
        );

        cities.addAll(list2);

        System.out.println("Aufgabe 2 ------------------");
        System.out.println();

        String text ="Bis zu seinem elften Geburtstag glaubt Harry, "
                + "er sei ein ganz normaler Junge. Doch dann erfährt er, "
                + "dass er sich an der Schule für Hexerei und Zauberei einfinden soll";

        String[] words = text.split(" ");
        List<String> listWords = Arrays.asList(words);

        //          sortedList.add(listWords.stream()
        //              .filter(p -> p.contains("er")));

        for(String i: listWords) {
            if(i.contains("er")) {
                System.out.println(i);
            }
        }
    }
}
