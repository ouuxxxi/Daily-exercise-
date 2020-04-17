package March;

import java.util.Scanner;

//个位数统计
public class Day011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[10];//只有0-9 10个数据

        //统计每个元素出现的个数
        for (int i = 0; i <s.length() ; i++) {
            count[s.charAt(i)-'0']++;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0){
                System.out.println(i+":"+count[i]);
            }
        }
    }
}
