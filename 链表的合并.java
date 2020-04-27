package March;

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/*给定一个链表的头指针 ListNode* pHead
采用两个链表small和big,分别使smallHead和bigHead指向两个链表的表头。最后再将大链表链接在小链表之后。*/
public class Day020 {
    public ListNode partition(ListNode pHead, int x) {
      ListNode big = new ListNode(-1);
      ListNode small = new ListNode(-1);

      ListNode bigHead = big;
      ListNode smallHead = small;

      while (pHead!=null){
          if(pHead.val < x){
              smallHead.next = pHead;
              small=small.next;
          }else {
              bigHead.next=pHead;
              big=big.next;//big链表往后走
          }

          //链表第一个节点判断完，继续往后走
          pHead=pHead.next;
      }

      //big链表接在small链表后面
        small.next=bigHead.next;
        big.next=null;
        return smallHead.next; //返回排好序的新链表
    }
}
