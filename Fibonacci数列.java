package March;

import java.util.Scanner;

//Fibonacci数列
public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int s1 = 0, s2 = 1;
        while (s2<N){
            int s3 = s1+s2;
            s1=s2;
            s2=s3;
        }
        int count = (s2-N) > (N-s1) ? N-s1:s2-N;
        System.out.println(count);
    }
}
