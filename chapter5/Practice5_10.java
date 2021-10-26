import java.util.*;

public class Practice5_10 {

    public static void main(String[] args) {
        // eec + cde = beb

        String str1 = "eec";
        String str2 = "cde";
        String str3 = "beb";

        int suml = 0;
        int sumr = 0;
        int strlen = str1.length();
        Scanner keyin = new Scanner(System.in);
        int[] list = new int[3];
        // value of b
        list[0] = keyin.nextInt();
        // value of d
        list[1] = keyin.nextInt();
        // value of e
        list[2] = keyin.nextInt();
        int c = 0;
        for (; c < 10; c++) {
            suml = sumr = 0;
            for (int i = 0; i < strlen; i++) {
                if (str1.charAt(i) == 'b' || str1.charAt(i) == 'd' || str1.charAt(i) == 'e') {
                    suml += convertChar(str1.charAt(i), list) * Math.pow(10, strlen - i - 1);
                } else {
                    suml += c * Math.pow(10, strlen - i - 1);
                }

                if (str2.charAt(i) == 'b' || str2.charAt(i) == 'd' || str2.charAt(i) == 'e') {
                    suml += convertChar(str2.charAt(i), list) * Math.pow(10, strlen - i - 1);
                } else {
                    suml += c * Math.pow(10, strlen - i - 1);
                }

                if (str3.charAt(i) == 'b' || str3.charAt(i) == 'd' || str3.charAt(i) == 'e') {
                    sumr += convertChar(str3.charAt(i), list) * Math.pow(10, strlen - i - 1);
                } else {
                    sumr += c * Math.pow(10, strlen - i - 1);
                }

            }
            if (suml == sumr)
                break;
        }

        if (c == 10) {
            System.out.print(-1);
        } else {
            System.out.print(c);
        }

    }

    public static int convertChar(char ch, int[] list) {

        switch (ch) {
        case 'b':
            return list[0];
        case 'd':
            return list[1];
        case 'e':
            return list[2];
        }
        return -1;
    }
}