package March;
//数字之和

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.print(sum(num) + " " + sum(num*num));
        }
    }
    public  static int sum(int n){
        int a = 0;
        while (n!=0){
            a = a + n%10;
            n=n/10;
        }
        return a;
    }

}
