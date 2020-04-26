package March;
//字串判断
public class Day019 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        char[] chars = s.toCharArray();
        boolean[] booleans = new boolean[n];
        for (int i = 0; i <n ; i++) {
                if(s.contains(p[i])){
                    booleans[i]=true;
                }else{
                  booleans[i] = false;
            }
        }
        return booleans ;
    }
}
