package March;

import java.util.Scanner;

//跟奥巴马一起编程
public class Day13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String c =sc.next(); //注意这里不是字符串

        for (int i = 0; i < N; i++) {
            System.out.print(c); //输出第一行
        }
        System.out.println();

        //中间的行
        for (int i = 0; i < Math.ceil((double) N/2-2) ; i++) {

            System.out.print(c); //中将每行的一个字符
            for (int j = 2; j <= N-1 ; j++) { //从第二个字符到倒数第一个都为空格；
                System.out.print(" ");
            }
            System.out.print(c);//中间行最后一个字符
            System.out.println();//换行

        }

        //输出最后一行
        for (int i = 0; i < N; i++) {
            System.out.print(c); //输出第一行
        }

    }

}
