import java.util.*;

public class Practice5_7 {
    public static void main(String[] args) {
        String stra = "eec";
        String strb = "cde";
        String sum = "beb";
        int straTempTotal = 0, strbTempTotal = 0, sumTempTotal = 0;
        // boolean isOutOfBounds = false;
        int strlen = stra.length();
        int answer = 0;
        for (; answer < 10; answer++) {
            straTempTotal = 0;
            strbTempTotal = 0;
            sumTempTotal = 0;
            for (int i = 0; i < strlen; i++) {
                if (stra.charAt(i) != 'c') {
                    straTempTotal += convertLetterToInt(stra.charAt(i)) * Math.pow(10, strlen - i - 1);
                } else {
                    straTempTotal += answer * Math.pow(10, strlen - i - 1);
                }

                if (strb.charAt(i) != 'c') {
                    strbTempTotal += convertLetterToInt(strb.charAt(i)) * Math.pow(10, strlen - i - 1);
                } else {
                    strbTempTotal += answer * Math.pow(10, strlen - i - 1);
                }

                if (sum.charAt(i) != 'c') {
                    sumTempTotal += convertLetterToInt(sum.charAt(i)) * Math.pow(10, strlen - i - 1);
                } else {
                    sumTempTotal += answer * Math.pow(10, strlen - i - 1);
                }
            }
            if ((straTempTotal + strbTempTotal) == sumTempTotal)
                break;
        }
        // System.out.println(straTempTotal + " + " + strbTempTotal + " = " +
        // sumTempTotal);
        System.out.print(answer);
    }

    static int convertLetterToInt(char ch) {
        switch (ch) {
            case 'd':
                return 0;
            case 'e':
                return 1;
            case 'b':
                return 4;
        }
        return -1;
    }
}