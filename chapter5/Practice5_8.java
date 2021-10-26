import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        String stra = "abc";
        String strb = "gch";
        String sum = "eeid";
        // "abc" is a constant 543
        int straTotal = 543, strbTotal = 0, sumTotal = 0;
        int strLeftLength = strb.length();
        int strRightLength = sum.length();
        // a is the value of 'e',and b is the value of 'h'
        int a = 0, b = 0;
        innerLoop: for (; a < 10; a++) {
            b = 0;
            for (; b < 10; b++) {
                strbTotal = 0;
                sumTotal = 0;
                for (int i = 0; i < strLeftLength; i++) {
                    if (strb.charAt(i) == 'e') {
                        strbTotal += a * Math.pow(10, strLeftLength - i - 1);
                    } else if (strb.charAt(i) == 'h') {
                        strbTotal += b * Math.pow(10, strLeftLength - i - 1);
                    } else {
                        strbTotal += convertLetterToInt(strb.charAt(i)) * Math.pow(10, strLeftLength - i - 1);
                    }
                }
                for (int i = 0; i < strRightLength; i++) {
                    if (sum.charAt(i) == 'e') {
                        sumTotal += a * Math.pow(10, strRightLength - i - 1);
                    } else if (sum.charAt(i) == 'h') {
                        sumTotal += b * Math.pow(10, strRightLength - i - 1);
                    } else {
                        sumTotal += convertLetterToInt(sum.charAt(i)) * Math.pow(10, strRightLength - i - 1);
                    }
                }
                // System.out.printf("%d\t%d\t%d\n", straTotal, strbTotal, sumTotal);
                if ((straTotal + strbTotal) == sumTotal)
                    break innerLoop;
            }
        }
        System.out.println(a);
        System.out.print(b);
    }

    static int convertLetterToInt(char ch) {
        switch (ch) {
            case 'a':
                return 5;
            case 'b':
                return 4;
            case 'c':
                return 3;
            case 'd':
                return 0;
            case 'g':
                return 6;
            case 'i':
                return 8;
        }
        return -1;
    }
}