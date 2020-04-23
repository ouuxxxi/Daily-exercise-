package leetcode;

import java.util.HashSet;
import java.util.Set;

//136. 只出现一次的数字
public class Solution1 {

    //方法一：全员异或 相同为0 不同为1
    public int singleNumber(int[] nums) {
      int ret = 0;
        for (int i = 0; i < nums.length ; i++) {
            ret ^= nums[i];
        }
        return ret;
    }
/*
HashSet集合中不能有重复的元素，如果集合中有1 2 3，再添加3就添加不了,也就是add() 方法返回false
有了这个知识点我们来看这个:
扫描数组,获取下标对应的值，把值添加到集合s . add(nums [i])
add()返回true,那么说明这个元素能添加进去，即这个数是第一次出现，取反后循环进不去
add()返回false,说明当前元素集合里面有，元素就添加不了,取反循环就进去了,进去之后再把这个重复的数删掉。
以上就能保证集合中存的都是出现一次的了。
*/
    //方法二：
    public int singleNumber1(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            if(!s.add(nums[i])){//说明里面已经有这个元素了
                s.remove(nums[i]);
            }
        }

        Object[] arr = s.toArray();
        return (int)arr[0];
    }
}
