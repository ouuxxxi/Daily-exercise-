package May;

import java.util.Scanner;

//字母统计
public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[256];
        for (int i = 0; i < s.length() ; i++) {
            arr[s.charAt(i)]++;
        }
            for(int i ='A';i<='Z';i++){
                System.out.println((char)i+":"+arr[i]);
            }

        }
    }

