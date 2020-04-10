package March;
import java.util.*;

//n个数里出现次数大于n/2的数
public class Day06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            String[] s = str.split(" ");

            for (int i = 1; i < s.length; i++) {
                int count = 0;
                for (int j = 0; j < s.length; j++) {
                    if(s[i].equals(s[j])){
                        count++;
                    }
                }
              if(count>=s.length/2){
                  System.out.println(s[i]);
                  break;//打印一个就好
              }
            }


        }

    }
