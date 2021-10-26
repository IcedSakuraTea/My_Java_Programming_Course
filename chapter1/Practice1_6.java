import java.util.Scanner;

public class Practice1_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int height, weight;

        height = keyboard.nextInt();
        weight = keyboard.nextInt();
        double heightInMeter = height / 100.0;
        double bmi = weight / (heightInMeter * heightInMeter) - 0.05;
        System.out.printf("%.1f", bmi);
    }
}