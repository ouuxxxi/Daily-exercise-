package May;
//大整数排序

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            BigInteger[] s = new BigInteger[n];
            for (int i = 0; i <n ; i++) {
                s[i] = sc.nextBigInteger();
            }
            Arrays.sort(s);
            for (int i = 0; i < n ; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
