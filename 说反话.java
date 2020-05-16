package May;


import java.util.Scanner;

//说反话
public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        String[] list=line.split(" ");
        for(int i=list.length-1;i>=0;i--){
            System.out.print(list[i]+" ");
        }
    }
}
