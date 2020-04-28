package March;
//微信红包

import java.util.Arrays;
//先排序，再找最中间的元素，堪忧几个元素与他相等
public class Day20 {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int a = gifts[n/2];
        int count=0;
        for (int i = 0; i < n; i++) {
            if(gifts[i]==a){
                count++;
            }
        }
        if(count>n/2){
            return a;
        }
        return 0;
    }
}
