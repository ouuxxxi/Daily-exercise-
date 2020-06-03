package May;

import java.util.Scanner;

//骆驼命名法
public class Day044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            char[] arr = s.toCharArray();
            int i = 0;//设置指针
            StringBuilder sb = new StringBuilder();
            while (i<arr.length) {
                if(arr[i]!='_'){
                   sb.append(arr[i]);
                   i++;
                }else { //如果是‘_’,则它后面一个字母是大写字母
                    i++;
                    sb.append((arr[i]+"").toUpperCase());
                    i++;
            }

            }
            System.out.println(sb.toString());
        }
    }
}
