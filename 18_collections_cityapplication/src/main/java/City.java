public class City {

    private String city;
    private int population;

    public City(String city, int population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return "city: " + city + " Total population: " + population;
    }
}
