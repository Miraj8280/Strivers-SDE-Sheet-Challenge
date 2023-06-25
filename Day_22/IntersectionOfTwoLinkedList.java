/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Node node1 = firstHead;
        Node node2 = secondHead;

        if(node1 == null || node2 == null) {
            return 0;
        }

        while(node1 != node2) {
            node1 = (node1 != null) ? node1.next : secondHead;
            node2 = (node2 != null) ? node2.next : firstHead;
        }

        return node1.data;
    }
}
