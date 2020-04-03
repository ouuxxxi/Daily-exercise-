package March;
//45842-统计回文
import java.util.*;

public class Day1 {
    public static boolean huiWen(String s){
        int i = 0 ;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        int count = 0;
        for(int i = 0; i<= str1.length();i++){
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i,str2); //字符串的插入
            String s = sb.toString();// StringBuilder转化为String类型
            if(huiWen(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
