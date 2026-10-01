/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node realHead = head;
        
        Node result;

        HashMap<Node, Node> hashMap = new HashMap<>();
        
        while(head != null) {
            hashMap.put(head, new Node(head.val));
            head = head.next;
        }

        head   = realHead;
        result = hashMap.get(realHead);
        
        Node realResult = result;

        while(head != null && result != null) {
            result.next   = hashMap.get(head.next);
            result.random = hashMap.get(head.random);
            
            result = result.next;
            head   = head.next;
        }

        return realResult;

    }
}
