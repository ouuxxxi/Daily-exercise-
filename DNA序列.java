package March;
//DNA序列

/*
先获取到字符串基因序列str和子串的长度len，其实GC比例最高就是找出现GC的字符串最多的子串。
因此从下标为0的位置开始遍历，同时统计出现C或者G的个数，用max记录结果子串的起始下标，
一旦count[i]超过count[max]，就将i赋值给max。最后输出str.substring(max,max+len)。
*/
import java.util.Scanner;
public class Day18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();

        int[] count=new int[s.length()-n];
        int max=0;//定义一个指针 从0开始

        //截取子串 i最大为s.length()-n
        for(int i=0;i<s.length()-n;i++){
            String substr=s.substring(i,i+n);

            //在截取的子串中判断G、C个数最多的
            for(int j=0;j<n;j++){
                if(substr.charAt(j)=='C'||substr.charAt(j)=='G'){
                    count[i]++; //个数加1
                }
            }
            if(count[max]<count[i]){
                max=i;
            }
        }

        System.out.println(s.substring(max,max+n));
    }
    }

