import java.util.*;
//牛客网：汽水瓶问题
public class Day2 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int n ;
            while (sc.hasNext()){
                n=sc.nextInt();
                System.out.println(juice(n));
            }

        }

        public static int juice(int num){
            int count=0;//饮料总数

            //当大于两个空瓶的时候才可以换饮料
            while(num>2){
                int a  = num/3;//可以兑换的可乐数(喝完后也是空瓶)
                count +=a;
                //num%3:兑换可乐后剩余的空瓶（不够3个）
                num=a+num%3;

            }
            if(num == 2){//可以再喝一瓶
                count++;
            }
            return count;
        }
    }

