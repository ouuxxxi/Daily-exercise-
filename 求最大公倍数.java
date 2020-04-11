package March;

import java.util.Scanner;

//求最大公倍数
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = a(A,B);
        int n = (A * B) / C;
        System.out.println(n);
    }
    public static int a(int x,int y) {
        int rem=0;
        while (x%y!=0){
            rem = x%y;
            x = y;
            y = rem;
        }
        return rem;
    }
}

