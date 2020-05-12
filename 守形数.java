package April;
//守形数

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int sum = num*num;
            int a =sum%10;
            int b = (sum/10)%10;
            if(num== a+b*10){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }

        }

    }
}
