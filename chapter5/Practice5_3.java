import java.util.Scanner;

public class Practice5_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int init = 0;
        for (int row = n; row > 0; row--, init++) {
            for (int spaceCount = 0; spaceCount < row - 1; spaceCount++) {
                System.out.print(' ');
            }
            for (int starCount = 0; starCount < 2 * init + 1; starCount++) {
                System.out.print('*');
            }
            if (init < n - 1)
                System.out.println();
        }
        keyboard.close();
    }
}