package May;

import java.util.Scanner;

//回文串
public class Day39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.nextLine();

            int i = 0, j = s.length() - 1;
            boolean result = true;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    result = isHuiWen(s, i + 1, j) || isHuiWen(s, i, j - 1);
                    break;
                }
                i++;
                j--;
            }
            System.out.println(result? "YES" : "NO");
        }
    }

    private static boolean isHuiWen(String s , int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
