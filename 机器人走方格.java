package March;

import java.util.*;
//机器人走方格
public class Day010 {

    public static int countWays(int x, int y) {
        if(x==1 || y==1) {
             return 1;
        }
        return (countWays(x-1, y) + countWays(x, y-1));
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] chess = new int[x][y];
        int num = countWays(x,y);
        System.out.println(num);
    }

}
