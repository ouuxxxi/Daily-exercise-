package March;
//无缓存交换

import java.util.*;
public class Day12 {

    public int[] exchangeAB(int[] AB) {
        // write code here
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < AB.length; i++) {
            stack.push(AB[i]);
        }
        int a =stack.pop();
        int b =stack.pop();
        return new int[]{a,b};
    }


}
