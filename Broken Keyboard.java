package May;
//Broken Keyboard
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Day034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = a.toUpperCase();
        String d = b.toUpperCase();

        //去重
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < c.length(); i++) {
            //d中如果不包含c
            if (!d.contains(String.valueOf(c.charAt(i)))) {
                set.add(c.charAt(i));
            }
        }
            for (Character ch : set) {
                System.out.print(ch);
            }

        }
    }

