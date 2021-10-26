import java.util.*;

public class Practice5_9 {
    public static void main(String[] args) {
        String strl = "TOO";
        String sum = "GOOD";
        // "abc" is a constant 543
        int strLeftTotal = 0, sumTotal = 0;
        int strLeftLength = strl.length();
        int strRightLength = sum.length();
        // a is the value of 'T'
        // b is the value of 'O'
        // c is the value of 'G'
        // d is the value of 'D'
        int a = 0, b = 0, c = 0, d = 1, iter = 0;
        innerLoop: for (; a < 10; a++) {
            b %= 10;
            for (; b < 10; b++) {
                c %= 10;
                for (; c < 10; c++) {
                    d %= 10;
                    for (; d < 10; d++) {
                        strLeftTotal = sumTotal = 0;
                        for (iter = 0; iter < strLeftLength; iter++) {
                            if (strl.charAt(iter) == 'T') {
                                strLeftTotal += a * Math.pow(10, strLeftLength - iter - 1);
                            } else if (strl.charAt(iter) == 'O') {
                                strLeftTotal += b * Math.pow(10, strLeftLength - iter - 1);
                            }
                        }
                        for (iter = 0; iter < strRightLength; iter++) {
                            if (sum.charAt(iter) == 'G') {
                                sumTotal += c * Math.pow(10, strRightLength - iter - 1);
                            } else if (sum.charAt(iter) == 'O') {
                                sumTotal += b * Math.pow(10, strRightLength - iter - 1);
                            } else if (sum.charAt(iter) == 'D') {
                                sumTotal += d * Math.pow(10, strRightLength - iter - 1);
                            }
                        }
                        // System.out.printf("\t%d\t%d\n", strLeftTotal, sumTotal);
                        if ((4 * strLeftTotal) == sumTotal)
                            break innerLoop;
                    }
                }
            }
        }
        System.out.printf("T = %d O = %d G = %d D = %d\n", a, b, c, d);
    }
}