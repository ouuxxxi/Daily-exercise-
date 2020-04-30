package March;
//最难的问题
import java.util.Scanner;

public class Day021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[] chars = new char[200];
            String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String str2 = "VWXYZABCDEFGHIJKLMNOPQRSTU";

            for (int i = 0; i < str1.length() ; i++) {
                chars[str1.charAt(i)] =str2.charAt(i);
            }
            String ss ="";
            for (int i = 0; i < s.length() ; i++) {
                if(s.charAt(i)==' '){
                    ss+=" ";
                }else {
                    ss += chars[s.charAt(i)];
                }
            }
            System.out.println(ss);
        }
    }
}
