package May;

import java.util.Scanner;

//单词倒排
public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] res=s.split(" ");
            StringBuilder sb = new StringBuilder();

            for (int i = res.length-1; i >=0 ; i--) {
                sb.append(res[i]+" ");
            }
            System.out.println(sb.toString());
        }
    }
}
