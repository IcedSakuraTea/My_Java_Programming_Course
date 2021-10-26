import java.util.Scanner;

public class Practice1_10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        n = keyboard.nextInt();
        long suml = 1;
        for (; n != 0; n--) {
            if (suml < 0) {
                System.out.print("815915283247897734345611269596115894272000000000");
                return;
            }
            suml *= n;
        }

        System.out.printf("%d", suml);
    }
}