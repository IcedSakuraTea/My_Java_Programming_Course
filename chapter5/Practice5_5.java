import java.util.Scanner;

public class Practice5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeW, sizeH, x, y, count;
        sizeW = sc.nextInt();
        sizeH = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        count = 0;
        for (int i = 0; i < sizeW; i++) {
            for (int j = 0; j < sizeH; j++) {
                ++count;
                if (x == i && y == j) {
                    System.out.print(count);
                }
            }
        }
        sc.close();
    }
}