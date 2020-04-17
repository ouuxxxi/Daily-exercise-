package March;
//构建乘积数组

public class Day11 {
    public static void main(String[] args) {

    }
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        B[0] = 1;
        for(int i = 1; i < length; i ++){
            B[i] = B[i - 1] * A[i - 1];
        }
        int temp = 1;
        for(int j = length - 2; j >= 0; j --){
            temp *= A[j + 1];//temp始终会记录值，每次只需要加上这行上三角没有乘进来的数就可以了。
            B[j] *= temp;
        }
        return B;
    }
}

