package lists;

public class DetectLoopInSingleLinkList {

    class Node {
        int data;
        Node next;
    }
    public static void main(String[] arg) {
      //  hasCycle(head)
    }
    boolean hasCycle(Node head) {
        Node current_slow =head, current_fast=head;
        while(current_fast.next!=null && current_slow!=null && current_fast!=null) {
            current_slow=current_slow.next;
            current_fast=current_fast.next.next;
            if(current_slow==current_fast) {
                System.out.println("Found loop");
                return true;
            }
        }
        return false;
        
    }
}
