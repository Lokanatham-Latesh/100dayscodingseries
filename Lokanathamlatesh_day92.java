import java .util.*;
public class Lokanathamlatesh_day92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // size of X
            int m = scanner.nextInt(); // number of sets Si

            List<Set<Integer>> sets = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int setSize = scanner.nextInt();
                Set<Integer> set = new HashSet<>();
                for (int j = 0; j < setSize; j++) {
                    set.add(scanner.nextInt());
                }
                sets.add(set);
            }

            int result = minimumAtoms(n, sets);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int minimumAtoms(int n, List<Set<Integer>> sets) {
        List<Set<Integer>> atoms = new ArrayList<>();
        for (Set<Integer> set : sets) {
            boolean found = false;
            for (Set<Integer> atom : atoms) {
                boolean isSubset = true;
                for (int element : set) {
                    if (!atom.contains(element)) {
                        isSubset = false;
                        break;
                    }
                }
                if (isSubset) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                atoms.add(set);
            }
        }
        return atoms.size();
    }

}
