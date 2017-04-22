package solutions;

public class AddTwoNumberSolution {
     ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = (l1.val + l2.val);
        ListNode result = new ListNode(i%10);
        ListNode holder = result;
        while((l1=(l1 == null ? null : l1.next)) != null | (l2=(l2 == null ? null : l2.next)) != null){
            i = i / 10;
            i += (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            holder.next = new ListNode(i%10);
            holder = holder.next;
        }
        if(i>9) {
            holder.next = new ListNode(1);
        }
        return result;
    }

}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
