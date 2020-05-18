package May;
//2的个数
public class Day32 {
    public int countNumberOf2s(int n) {
        int count=0;
        for(int i = 0; i<n;i++){
            while(i>10){
                if(i%10==2){
                    count++;
                }
                i=i/10;
            }
        }
        return count;
    }
}
