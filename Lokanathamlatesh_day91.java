import java.util.*;
public class Lokanathamlatesh_day91 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of cities
            scanner.nextLine();

            Map<String, City> cities = new HashMap<>();

            for (int i = 0; i < n - 1; i++) {
                String[] input = scanner.nextLine().split(" ");
                String cityA = input[0];
                String cityB = input[1];
                int cost = Integer.parseInt(input[2]);

                if (!cities.containsKey(cityA)) {
                    cities.put(cityA, new City(cityA, cost));
                } else {
                    cities.get(cityA).cost = cost;
                }

                if (!cities.containsKey(cityB)) {
                    cities.put(cityB, new City(cityB, 0));
                }
            }

            List<String> order = findOrder(cities);

            for (String city : order) {
                System.out.println(city + " " + cities.get(city).cost);
            }

            int totalCost = calculateTotalCost(cities);
            System.out.println(totalCost);
        }
    }

    private static List<String> findOrder(Map<String, City> cities) {
        List<String> order = new ArrayList<>();

        // Find the starting city
        String startCity = "";
        for (City city : cities.values()) {
            if (city.cost != 0) {
                startCity = city.name;
                break;
            }
        }

        // Traverse the cities in the order of their connections
        while (startCity != null) {
            order.add(startCity);
            startCity = cities.get(startCity).name;
        }

        return order;
    }

    private static int calculateTotalCost(Map<String, City> cities) {
        int totalCost = 0;
        for (City city : cities.values()) {
            totalCost += city.cost;
        }
        return totalCost;
    }
}
class City {
    String name;
    int cost;

    public City(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}