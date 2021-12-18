package countbymap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountByMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();

        System.out.println("Nhập 1 chuỗi vào đi: ");
        String word = sc.nextLine();

        char[] ch = word.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

        for (int i = 0; i < ch.length; i++) {
            int key = 1;
            if (map.containsKey(String.valueOf(ch[i]))){
                key = map.get(String.valueOf(ch[i]))+1;
            }
            map.put(String.valueOf(ch[i]),key);
        }
        System.out.println(map);
    }
}
