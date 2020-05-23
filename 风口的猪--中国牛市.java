package May;
//风口的猪--中国牛市
public class Day035 {
    public int calculateMax(int[] prices) {
      int firstBuy = Integer.MIN_VALUE;
      int firstSell = 0;
      int secondBuy = Integer.MIN_VALUE;
      int secondSell = 0;

        for (int i:prices) {
            //第一次价格买入应该是越小越好，因为是买入所以是负值，倒贴钱，
            firstBuy = Math.max(firstBuy,-i);

            //第一次卖出后的收益：当前价格减去第一次买入价格，越高越好
            firstSell = Math.max(firstSell,firstBuy+i);

            //第二次买入后的收益：第一次卖出后的收益-当前价格，越高越好
            secondBuy = Math.max(secondBuy,firstSell-i);

            //第二次卖出后的收益：等于第二次买入后的收益加上当前价格，越高越好
            secondSell = Math.max(secondSell,secondBuy+i);
        }
        return secondSell;
    }
}
