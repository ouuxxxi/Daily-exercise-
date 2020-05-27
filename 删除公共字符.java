package May;

import java.util.Scanner;
//删除公共字符
public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            //s2中没有包含s1的字符串 输出
            for(int i=0;i<s1.length();i++){
                if(!s2.contains(String.valueOf(s1.charAt(i)))){
                    System.out.print(s1.charAt(i));
                }
                System.out.println();
        }
    }
   }
}
