package March;

import java.util.Scanner;

//计算糖果
public class Day6 {
    public static void main(String[] args) {
    int A=0, B=0,C=0;
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()){
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        A=(n1+n3)/2;
        B=(n2+n4)/2;
        C=n4-((n2+n4)/2);


        if(n1==A-B && n2==B-C && n3==A+B && n4==B+C){
            System.out.print(A+" " + B+" " + C +" ");
        }else{
            System.out.print("NO");
        }

      }
    }
}
