import java.util.Scanner;

public class Practice1_8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;

        score = keyboard.nextInt();

        if (score <= 100 && score >= 0) {
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.print("A");
                    break;
                case 8:
                    System.out.print("B");
                    break;
                case 7:
                    System.out.print("C");
                    break;
                case 6:
                    System.out.print("D");
                    break;
                case 5:
                    System.out.print("E");
                    break;
                default:
                    System.out.print("Failed");
                    break;
            }
        } else {
            System.out.printf("OOR");
        }
    }
}