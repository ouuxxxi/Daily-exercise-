package March;
//链式A+B
public class Day022 {
    public ListNode plusAB(ListNode a, ListNode b) {
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }

        ListNode c = new ListNode(-1);

        //设置指针
        ListNode aHead = a;
        ListNode bHead = b;
        ListNode cHead = c;

        int sum=0;
        while (aHead != null || bHead != null || sum != 0) {
            if (aHead != null) {
                sum += aHead.val;
                aHead = aHead.next;
            }
            if (bHead != null) {
                sum += bHead.val;
                bHead = bHead.next;
            }
            ListNode node = new ListNode(sum % 10);
            cHead.next = node;
            sum /= 10;
            cHead = cHead.next;
        }
        return c.next;
    }
}
