import java.util.Scanner;

public class IncrementDemo {
    public static void main(String[] args) {
        int a, b;
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        // ---------------------
        // ---Begin to Modify---
        // ---------------------
        x = 3 * a + 5;
        y = (-1) * b + 4;
        z = a + b;
        // ---------------------
        // ---End to Modify-----
        // ---------------------

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
