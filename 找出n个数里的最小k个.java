package March;

import java.util.Arrays;
import java.util.Scanner;

//找出n个数里的最小k个
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int k = 0;
        int[] nums = new int[arr.length];
        int i;
        for (i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(arr[i]);
            k=nums[nums.length-1];
        }
        int[] nums1=Arrays.copyOf(nums,nums.length-1);
        Arrays.sort(nums1);
        for (int j = 0; j <k ; j++) {
            System.out.print(nums1[j] + " ");
        }
    }
}
