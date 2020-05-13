package April;
//密码验证合格程序
import java.util.Scanner;

public class Day028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            if(length(s) && isLegal(s) && different(s)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    //1.长度超过8位
      public  static  boolean length(String s){
        return  s.length()>8;
    }

    //2.包括大小写字母.数字.其它符号,以上四种至少三种
    public static  boolean isLegal(String s){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                count1=1;
            }else if(c>='a' && c<='z'){
                count2=1;
            }else if(c>='A' && c<='Z'){
                count3=1;
            }else {
                count4=1;
            }
        }
        int sum = count1 + count2 + count3 + count4;
        if(sum>=3){
            return  true;
        }else {
            return false;
        }
    }

    //3.不能有相同长度超2的子串重复
    public static boolean different(String s){
        for (int i = 0; i < s.length()-3; i++) {
            if(s.substring(i+3).contains(s.substring(i,i+3))){
                return  false;
            }
        }
        return true;
    }

}
