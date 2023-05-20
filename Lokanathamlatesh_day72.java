public class Lokanathamlatesh_day72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); 
        scanner.nextLine();
        StringBuilder editor = new StringBuilder();
        for (int i = 0; i < q; i++) {
            String query = scanner.nextLine(); 
            if (query.startsWith("+")) {
                String[] parts = query.split(" ");
                int index = Integer.parseInt(parts[1]);
                String text = parts[2];
                if (index == 0) {
                    editor.insert(0, text);
                } else {
                    editor.insert(index, text);}
            } else if (query.startsWith("?")) {
                String[] parts = query.split(" ");
                int index = Integer.parseInt(parts[1]);
                int length = Integer.parseInt(parts[2]);
                String substring = editor.substring(index - 1, index - 1 + length);
                System.out.println(substring);
            }
        }
    }
}
