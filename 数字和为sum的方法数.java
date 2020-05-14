package May;
//数字和为sum的方法数

/*
 解：此题使用递归的遍历方法也可以解决，但是会超时
   dp解决：
   以每个物品作为横轴，以背包容量作为纵轴
       0 1 2 3 4 5 6..........
     0 1 0 0 0 0 0 0..........
     5 1 0 0 0 0 1 0

      其中1表示前n件物品放入容量为M的背包有1种方法，
      （5，0）表示重量为5的物品放入容量为0的背包的背包有1中方法，即不放入。
       0表示恰好放满背包的方法为0
      当M>weight[i]时，dp[M]=dp[M]+dp[M-weight[i]];意义是：放入物品i和不放入物品i的方法总和
 */
import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n ; i++) {
            A[i] = sc.nextInt();
        }

        long[] count = new long[sum+1];
        count[0] = 1;
        for(int i=0;i<n;i++){
            if(A[i]<=sum){
                for(int j=sum;j>=0;j--){
                    if(count[j]>0 && j+A[i]<=sum){
                        count[j+A[i]] += count[j];
                    }
                }
            }
        }
        System.out.println(count[sum]);
      }
    }

