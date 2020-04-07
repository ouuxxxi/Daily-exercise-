package March;
import java.util.*;
//字符串中找连续最长的字符串


/*
* 假设数组叫arr
   String max = arr[0];
   for (String s : arr){
   if (max.length() < s.length()) {
         max = s;
        }
  }
  则max就是你要的
*/

public class Day3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();

            StringBuilder  sb = new StringBuilder();
            for(int i = 0 ; i< str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    sb.append(str.charAt(i));
                }else{
                    sb.append(" ");//如果不是数字，将空格加入到sb中
                }
            }
            String s = sb.toString();
            String[] nums = s.split("\\s+");//将str1以一个或者多个空格进行切割，存入到nums中

            String max = nums[0];
            for (String s1 :nums){
                if (max.length() < s1.length()){
                    max = s1;
                }
            }
            System.out.println(max);
        }
    }
}
