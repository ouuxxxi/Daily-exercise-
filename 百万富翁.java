package March;
//百万富翁
import java.lang.Math;
public class Day018 {
    public static void main(String[] args){
        int a=10*30;
        int b=0;
        for(int i=1;i<=30;i++){
            b=b+(int)Math.pow(2,i-1);
        }
        System.out.print(a+" "+b);
    }
}
