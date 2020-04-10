package March;
//神奇的口袋
import java.util.Scanner;
/*
①物品n个，物品体积逐一放入a[100]中
②递归函数count(i,sum)=count(i+1,sum-a[i])+count(i+1,sum);
其中，i为第i个物品，sum代表剩余空缺体积数

count(i+1,sum-a[i]): 代表从第i+1个物品开始，剩余体积数为sum-a[i]的方案数
（隐含：已经将a[i]的体积计算进去，即包含a[i]的体积）

count(i+1,sum) :代表从第i+1个物品开始，剩余体积数为sum的方案数
（隐含：不将a[i]的体积计算进去，即不包含a[i]的体积）*/

public class Day5 {
    private static int n;		//不同物品的数目
    private static int[]arr;	//记录各物品的体积

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt(); //数目
            int[] arr = new int[n];
         for (int i = 0 ; i< n;i++){
            arr[i] = input.nextInt();//各物品的体积
        }
        System.out.println(count(0,40));
    }
    public static int count(int i,int sum){ //i:剩下东西的数量 sum:背包剩余容量；
        if(sum==0){
          return 1;
        }
        if(sum<0||i==n){
            return 0;
        }

        //     不包含bags[i]元素     包含bags[i]元素
        return count(i+1,sum)+count(i+1,sum-arr[i]);
    }
}
