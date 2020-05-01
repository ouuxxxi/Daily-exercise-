package March;

//统计每个月兔子的总数

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            System.out.println(getTotalCount(a));
        }
    }
    public static int getTotalCount(int monthCount){
        if(monthCount==1 || monthCount==2){
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }
}
