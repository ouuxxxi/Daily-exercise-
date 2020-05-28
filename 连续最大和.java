package May;
//连续最大和
import java.util.Scanner;

//不断累加，只要小于0，清零，重新开始
// 只需要记录过程中的最大值
public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < n ; i++) {
               sum+=arr[i];
               if(sum>max){
                   max=sum;
               }
               if(sum<=0){
                   sum=0;
               }
            }
            System.out.println(max);
        }

    }
}
