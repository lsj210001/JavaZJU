import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<City> cityList = new ArrayList<City>();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (!input.equals("###")) {
            City city = new City(input);
            cityList.add(city);
            input = sc.next();
        }
        for (City cityOut : cityList) {
            for (City cityInner : cityList) {
                int distanceInput = sc.nextInt();
                cityOut.addCityDistance(cityInner.geyCityName(), distanceInput);
            }
        }
        String city1 = sc.next();
        String city2 = sc.next();
        for (City city : cityList) {
            if (city.geyCityName().equals(city1)) {
                System.out.println(city.getCityDistance(city2));
                break;
            }
            if (city.geyCityName().equals(city2)) {
                System.out.println(city.getCityDistance(city1));
                break;
            }
        }
        sc.close();
    }

}

class City {
    HashMap<String, Integer> CityDistance;
    private String name;

    City(String name) {
        CityDistance = new HashMap<String, Integer>();
        this.name = name;
    }

    void addCityDistance(String cityName, int distance) {
        CityDistance.put(cityName, distance);
    }

    int getCityDistance(String cityName) {
        return CityDistance.get(cityName);
    }

    String geyCityName() {
        return name;
    }
}