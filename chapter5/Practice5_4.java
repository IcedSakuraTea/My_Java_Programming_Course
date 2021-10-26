import java.util.Scanner;

public class Practice5_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char ch = keyboard.next().charAt(0);
        switch (ch) {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
                System.out.print("day");
                break;
            case '6':
                System.out.print("night");
                break;
            case '7':
                System.out.print("rest");
                break;
            default:
                System.out.print("Input Error");
                break;
        }
        keyboard.close();
    }
}