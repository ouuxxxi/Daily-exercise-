package March;
//末尾0的个数

import java.util.Scanner;
/*
尾部所有的0都是由因子5*2得到的，
由于2.6.8 都可以视为因子2，所以因子2的个数远大于因子5的个数
所以只需要求出因子5的个数即可。
由于25,125这个数不止含有一个因子5，所以需要求完后递归调用n/5
以上。
*/
public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = n; i >=5; i--) {
            int temp = i;
            while (temp%5==0){
                res++;
                temp=temp/5;
            }
        }
        System.out.println(res);
    }

}
