package March;

import java.util.Scanner;

//统计同成绩学生人数
public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
             int n = sc.nextInt();
             int[] arr = new int[n];
            for (int i = 0; i <arr.length ; i++) {
                arr[i] = sc.nextInt();
            }
            int a = sc.nextInt();
            int count =0;
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i] == a){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
