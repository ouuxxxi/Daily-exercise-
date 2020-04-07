package March;

import java.util.Scanner;

//买苹果
public class Day4 {
    public static int count(int num){
      if(num < 6 || num%2!= 0 || num==10){ //苹果个数小于6 是奇数 等于10
          return -1;
      }
      if(num % 8 == 0){ //能被8整除
          return num/8;
      }
      return num/8+1;//10以上的偶数：不能被8整除 余数为0、2、4、6
        /*
        * 余数为0：刚好是8的倍数
        * 余数为2：可以从前面借2个8袋的---->比如18个：8+8+2 => 18%6==0 从前面借了两个8(18/6=3袋)
        * 余数为4：从前面借1个---->比如28：3 * 8 + 4 => 8 8 (8+4)=12 % 6 ==0 从前面借了一个8(12/6=2袋)
        * 余数为6：刚好剩余6个 ：n/8袋 + 1（6个一袋的）
        *
        */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }
}
