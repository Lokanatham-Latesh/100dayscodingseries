import java.util.*;
public class Lokanathamlatesh_dat80{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] animals = new int[n];
            for (int i = 0; i < n; i++) {
                animals[i] = scanner.nextInt();
            }
            System.out.println(canAliceAndBobHaveSameAnimals(animals) ? "YES" : "NO");
        }
        scanner.close();
    }

    private static boolean canAliceAndBobHaveSameAnimals(int[] animals) {
        Set<Integer> aliceAnimals = new HashSet<>();
        Set<Integer> bobAnimals = new HashSet<>();

        for (int animal : animals) {
            if (!aliceAnimals.contains(animal)) {
                aliceAnimals.add(animal);
            } else {
                bobAnimals.add(animal);
                aliceAnimals.remove(animal);
            }
        }

        return aliceAnimals.size() == bobAnimals.size();
    }
}