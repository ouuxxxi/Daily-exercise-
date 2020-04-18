package March;
//生成格雷码
public class Day012 {
    public String[] getGray(int n) {
                String[] arr = new String[(int)Math.pow(2,n)];// 格雷码的个数为2的n次方。如n=3时，有8个格雷码。
                if(n==1){
                    return new String[]{"0","1"};
                }else {
                    //递归前n-1的格雷码
                    String[] res = getGray(n-1);
                    for (int i = 0; i <res.length ; i++) {
                        arr[i]="0"+res[i];
                    }
                }
                return arr;
    }

}
