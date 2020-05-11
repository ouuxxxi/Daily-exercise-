package March;
//找x

import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n  ; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int index=-1;
            for (int i = 0; i < n ; i++) {
                if(arr[i] == x){
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
}
