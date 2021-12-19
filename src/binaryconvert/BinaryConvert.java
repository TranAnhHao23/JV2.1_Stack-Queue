package binaryconvert;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Input number (Decimal): ");
//        int number = sc.nextInt();
//
//        System.out.println("Convert to binary: = " + decimalToBinary(number));

        System.out.println("Input number (Binary): ");
        int number2 = sc.nextInt();
        System.out.println("Convert to decimal = " + binaryToDecimal(String.valueOf(number2)));

    }

    public static String decimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        do {
            stack.push(number % 2);
            number = number / 2;
        } while ((number / 2) != 0);
        String num = "1";
        while (stack.size() > 0) {
            num += stack.pop();
        }
        if (number == 0) {
            return num = "0";
        } else {
            return num;
        }
    }


    public static int binaryToDecimal(String number) {
        char[] ch = number.toCharArray();
        int number2 = 0;
        for (int i = 0; i < ch.length; i++) {
            int temp = Integer.parseInt(String.valueOf(ch[i]));
            double temp2 = Math.pow(2,(ch.length - i-1));
            number2 += temp * temp2;
        }
        return number2;
    }


}
