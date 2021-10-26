import java.util.Scanner;

public class Practice1_9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int coupon, candyBar, gumball;
        int costPerCandyBar = 10, costPerGumball = 3;
        coupon = keyboard.nextInt();

        candyBar = coupon / costPerCandyBar;
        coupon = coupon % costPerCandyBar;
        gumball = coupon / costPerGumball;
        coupon = coupon % costPerGumball;
        System.out.printf("%d %d %d", candyBar, gumball, coupon);
    }
}