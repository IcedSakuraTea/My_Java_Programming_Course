import java.util.Scanner;

public class Practice5_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch[] = new char[5];
        for (int i = 0; i < 5; ++i) {
            ch[i] = (keyboard.next()).charAt(0);
        }
        int count = 0;
        for (char temp : ch) {
            switch (temp) {
                case 'a':
                    System.out.print('A');
                    break;
                case 'b':
                    System.out.print('B');
                    break;
                case 'c':
                    System.out.print('C');
                    break;
                case 'd':
                    System.out.print('D');
                    break;
                case 'e':
                    System.out.print('E');
                    break;
                default:
                    System.out.print('Z');
                    break;
            }
            if (count < 4) {
                System.out.print(' ');
            }
            count++;
        }
        keyboard.close();
    }
}