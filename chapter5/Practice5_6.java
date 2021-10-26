import java.util.*;

public class Practice5_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String stra;
        String strb;
        int sum = 0;
        boolean isOutOfBounds = false;
        stra = keyboard.next();
        strb = keyboard.next();
        int strlen = stra.length();

        for (int i = 0; i < strlen; i++) {
            // Check if input is valid
            isOutOfBounds = strb.charAt(i) > 'J' || strb.charAt(i) < 'A' || stra.charAt(i) > 'J'
                    || stra.charAt(i) < 'A';
            if (isOutOfBounds) {
                System.out.println("Input Error!!");
                break;
            }
            // Convert letters to integers and sum them
            int n = ((stra.charAt(i) - 65) + (strb.charAt(i) - 65)) * (int) Math.pow(10, strlen - 1);
            sum += n / Math.pow(10, i);
        }
        if (!isOutOfBounds)
            System.out.print(sum);
        keyboard.close();
    }

}