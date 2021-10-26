import java.util.Scanner;

public class Practice5_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int income;
        double tax = 0.0;
        income = keyboard.nextInt();
        if (income < 15000) { // Do nothing if income is lower than 15000
        } else if (income < 30000) {
            tax = (income - 15000) * 0.05;
        } else {
            tax = (15000 * 0.05) + ((income - 30000) * 0.1);
        }

        System.out.printf("%.2f", tax);
    }
}