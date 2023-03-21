public class App {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            String print = "" + i;
            int j = 1;
            while (j < i) {
                print += "" + i;
                j++;
            }
            System.out.println(print);
            i++;
        }
    }
}
