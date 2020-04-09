package March;

import java.util.Scanner;

//删除字符串
public class Day04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            char[] chars = str1.toCharArray();


            for (int i = 0; i <chars.length ; i++) {
              if(!str2.contains(String.valueOf(chars[i]))){ //str2种没有包含这个字符（字符串1中的第i个）
                  System.out.print(chars[i]);//就直接输出字符1 i位置上的字符
              }
            }
        }
    }
}
