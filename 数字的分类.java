package March;

//数字的分类
import java.text.DecimalFormat;
import java.util.Scanner;

public class Day023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum1 = 0;
            int sum2 = 0;
            int count0 = 0;
            int count1 = 0;
            int sum3 = 0;
            int count2 = 0;
            int avg = 0;
            int max = 0;

            for (int i = 0; i < arr.length ; i++) {
                arr[i] = sc .nextInt();

                //能被5整除的数字中所有偶数的和；
                if(arr[i] % 5 ==0){
                    sum1+=arr[i];
              }
                //将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
                if(arr[i] % 5 == 1){
                    //sum2+= Math.pow(-1,i) * arr[i];
                    sum2 += (((count0%2==0)?(1):(-1))*arr[i]);
                    count0++;
                }
                //被5除后余2的数字的个数
                if(arr[i] % 5 == 2){
                    count1++;
                }
                //被5除后余3的数字的平均数，精确到小数点后1位
                if(arr[i] % 5 == 3){
                    sum3+= arr[i];
                    count2++;
                }
                //被5除后余4的数字中最大数字
                if(arr[i] % 5 == 4){
                   if(arr[i]>max){
                       max = arr[i];
                   }
                }
            }
            if(sum1!=0){
                System.out.print(sum1+ " ");
            }else{
                System.out.print("N"+ " ");
            }

            if(sum2!=0){
                System.out.print(sum2+ " ");
            }else{
                System.out.print("N"+ " ");
            }

            if(count1!=0){
                System.out.print(count1+ " ");
            }else{
                System.out.print("N"+ " ");
            }

            if(sum3!=0){ //小数点后一位
                DecimalFormat df = new DecimalFormat("#.0");
                System.out.print(df.format(sum3/count2)+" ");
            }else{
                System.out.print("N"+ " ");
            }

            if(max!=0){
                System.out.print(max+ " ");
            }else{
                System.out.print("N"+ " ");
            }
        }

    }
}
