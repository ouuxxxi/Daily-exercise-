package May;
//上楼梯
public class Day33 {
    /*
    f(1)=1,f(2)=2,f(3)=4,
    f(n)=f(n-1)+f(n-2)+f(n-3)
    */
    public int countWays(int n) {
        if (n < 0)  return 0;
        int[] arr = {1,2,4};
        if(n<4){
            return arr[n-1];
        }
        int a = 1;int b = 2; int c = 4;
        int d = 0;
        int num=1000000007;
        for (int i = 3; i < n; i++) {
            d=((a+b)%num+c)%num;
            a=b;
            b=c;
            c=d;
        }
        return d;
    }
}
