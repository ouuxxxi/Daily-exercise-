package March;



import java.util.Scanner;

//组个最小数
public class Day014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        //先输出除0外的最小的数
        for (int i = 1; i < nums.length; i++) { //从1号元素开始
            if(nums[i]!=0){
                System.out.print(i);//下标就等于该数
                nums[i]--;        //个数减一
                break;           //跳出
            }
        }

        //从0开始输出
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]>0){ //个数大于1
                System.out.print(i);//下标就等于该数
                nums[i]--;        //个数减一
            }
        }
    }
}
