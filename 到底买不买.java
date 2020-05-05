package March;
//到底买不买

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            //将s1中的字符存入表中
           List<Character> list = new ArrayList<>();
            for (int i = 0; i < s1.length() ; i++) {
                list.add(s1.charAt(i));
            }

            int count = 0;//记录像等元素个数
            //遍历s2 并与list中的元素相比 看是否相等
            for (int i = 0; i <s2.length(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if(s2.charAt(i) == list.get(j)){
                        list.remove(j);//如果相等就删除
                         count++;
                         break;
                    }
                }
            }


            //多余的个数
            int len1 = s1.length()-count;
            //缺的个数
            int len2 =s2.length()-count;

            if(count == s2.length()){
                System.out.print("Yes "+ " " +len1);
            }else {
                System.out.print("No" + " " + len2);
            }


        }
    }
}
