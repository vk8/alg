package ch1;

public class RotateList61 {
    public static void main(String[] args) {
        ListNode listNode =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));

        printListNode(new RotateList61().rotateRight(listNode, 1));
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        temp.next = head; // make it circular

        ListNode pointToCut = head;
        for (int i = 1; i < len - k % len; i++)
            pointToCut = pointToCut.next;

        ListNode tempHead = pointToCut.next;
        pointToCut.next = null;
        return tempHead;
    }

    public int lenListNode(ListNode listNode) {
        ListNode temp = listNode;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    static void printListNode(ListNode listNode) {
        ListNode temp = listNode;
        while (temp != null) {
            System.out.printf("%1$d ", temp.val);
            temp = temp.next;
        }
    }



    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
