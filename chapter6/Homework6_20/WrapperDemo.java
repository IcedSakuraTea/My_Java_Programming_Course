import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr, outputStr = "";
        int inputInt, outputInt;
        inputStr = sc.next();
        inputInt = sc.nextInt();
        //
        outputInt = Integer.valueOf(inputStr);
        outputInt += 3;
        outputStr = String.valueOf(inputInt) + "3";
        //
        System.out.println(outputInt);
        System.out.print(outputStr);
    }
}