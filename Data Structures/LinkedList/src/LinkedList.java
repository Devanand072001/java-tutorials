public class LinkedList {

    ListNode head; // head of linked list

    // static inner class representing node.
    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

//        public ListNode(int data, ListNode next) {
//            this.data = data;
//            this.next = next;
//        }

        public ListNode insertAtBeginning(int key, ListNode head) {
            ListNode tempNode = new ListNode(key);
            // if head is empty
            if (head == null) {
                head = tempNode;
                // if head is not empty
            } else {
                tempNode.next = head;
                head = tempNode;
            }
            return head;
        }

        public ListNode insertAtEnd(int key, ListNode head) {
            ListNode tempNode = new ListNode(key);
            ListNode tempHead = head;
            if (tempHead == null) {
                head = tempNode;
            } else {
                while (tempHead.next != null) {
                    tempHead = tempHead.next;
                }
                tempHead.next = tempNode;
            }
            return head;
        }

        public ListNode insertAtPosition(int key, int pos, ListNode head) {
            ListNode tempNode = new ListNode(key);
            if (pos == 1) {
                tempNode.next = head;
                head = tempNode;
            } else {
                ListNode tempHead = head;
                for (int i = 1; tempHead != null && i < pos; i++) {
                    tempHead = tempHead.next;
                }
                assert tempHead != null;
                tempNode.next = tempHead.next;
                tempHead.next = tempNode;
            }
            return head;
        }


    }

    // to display values.
    public void displayValue() {
        ListNode tempHead = head;
        while (tempHead != null) {
            System.out.print(tempHead.data + " ");
            tempHead = tempHead.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // create three nodes
        linkedList.head = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);

        //connecting nodes
        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;
        System.out.println(linkedList.head.data);
        System.out.println(linkedList.head.next.data);
        System.out.println(linkedList.head.next.next.data);

        linkedList.displayValue();
    }
}