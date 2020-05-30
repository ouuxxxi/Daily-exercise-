package May;

import java.util.*;

//电话号码
public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zimu="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";

        while (sc.hasNext()){
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                String s = sc.next();
                s = s.replace("-","");
                String str = "";
                //一串
                for (int j = 0; j <7 ; j++) {
                    int a = zimu.indexOf(s.charAt(j)+"");
                    str+= number.charAt(a);
                }

                str=str.substring(0,3)+"-"+str.substring(3,7);
                if(!list.contains(str)){
                    list.add(str);
                }
            }
                Collections.sort(list);//排序

                //输出
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(list.get(j));
                }
                System.out.println();

        }
    }
}
