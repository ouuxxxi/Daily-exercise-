package March;
//记票统计
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Map<String,Integer> map=new HashMap<>();
            int num=sc.nextInt();//表示候选人数
            for(int i=0;i<num;i++){
                //map里key为候选人名字，value为候选人持有的票数
                map.put(sc.next(),0);//将候选人放进Map里，初始时他们各自持有的票数为0
            }
            int vote = sc.nextInt();//投票数
            int notVote = 0;//无效的票数
            for (int i = 0; i < vote ; i++) {
                String s = sc.next(); //投票的人名

                //如果不存在投票人 无效票数加1
                if(map.get(s) == null){
                    notVote++;
                }else {
//                 如果map里存在这个投票的人名，则将这个人对应的票数+1
                    map.put(s,map.get(s)+1);
                }
            }

            //遍历map
            for (Map.Entry e : map.entrySet()) {
                System.out.println(e.getKey()+ " : " +e.getValue());
            }
            System.out.println("Invalid : " +notVote);
        }
    }
}
