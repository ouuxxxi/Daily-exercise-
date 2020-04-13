package March;

import java.util.Scanner;

//数字颠倒(字符串逆置)
public class Day09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        System.out.println(reverse(s));
    }

    public static  String reverse(String str){

        char[] arr = str.toCharArray();
        int left = 0;
        int right =arr.length-1;

        for (int i = 0; i <arr.length ; i++) {
            while (left<right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.copyValueOf(arr);//数组拷贝过来
        //return new String(valuse);//新的对象
    }
}
