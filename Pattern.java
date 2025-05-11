public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // row loop

            // First loop: print decreasing numbers from 5 down to (6 - i)
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j + " ");
            }

            // Second loop: repeat (6 - i), (5 - i) times
            for (int k = i + 1; k <= 5; k++) {
                System.out.print((6 - i) + " ");
            }

            System.out.println(); // move to next line
        }
    }
}
