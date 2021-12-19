package palindrome;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindromecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> stringQueue = null;
        char[] ch = str.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            stack.push((ch[i]));
        }
        boolean check = true;
        for (int i = 0; i < ch.length; i++) {
            if (!stack.pop().equals(ch[i])){
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
