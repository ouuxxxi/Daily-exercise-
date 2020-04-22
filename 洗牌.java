package March;
//洗牌


import java.util.Scanner;

public class Day016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // T：要洗牌的牌组数量
        int T = sc.nextInt();
        while (T>0){
            // n：2n即牌的数量
            // k：洗牌的次数
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[2*n];

            //获得所有牌
            for (int i = 0; i < 2*n ; i++) {
                arr[i] = sc.nextInt();
            }

            //洗牌
            for (int i = 0; i < k  ; i++) {
                xiPai(arr,n);
            }
            for (int i = 0; i < 2*n-1 ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[2*n-1]);
            T--;
        }

    }

    public static void xiPai(int[] res, int n){
        int[] left = new int[n];
        int[] right = new int[n];

        //左半部分
        for (int i = 0; i < n ; i++) {
            left[i] = res[i];
        }

        //右半部分
        for (int i = n; i <2*n ; i++) {
            right[i-n] = res[i];
        }

        //设置两个指针
        int begin = 0;  int end =0;
        for (int i = 0; i < 2*n ; i++) {
            if(i%2==0){ //如果是偶数
                res[i] = left[begin++] ;

            }else{
                res[i] = right[end--] ;

            }
        }
    }
}
