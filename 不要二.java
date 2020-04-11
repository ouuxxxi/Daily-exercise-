package March;

import java.util.Scanner;

//不要二
public class Day07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int res = 0;
        if(n%4==0||m%4==0){
            res=m*n/2;//如果能整除4 那么蛋糕个数为网格个数的一半
        }
        else{
            res=n*m/2+1;//不能被4整除 将蛋糕每隔一个空放一个 可以放多少 奇数的一半+1
        }
        System.out.println(res);
    }
}
