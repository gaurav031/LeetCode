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
    private void insertAtTail(Node head[], int data) {
        Node newNode = new Node(data);
        if (head[0] == null) {
            head[0] = newNode;
            head[1] = newNode;
        } else {
            head[1].next = newNode;
            head[1] = newNode;
        }
    }

    public Node copyRandomList(Node head) {
        Node[] cloneHead = new Node[2];
        Node temp = head;
        while(temp != null){
            insertAtTail(cloneHead, temp.val);
            temp = temp.next;
        }
        HashMap <Node, Node> mapping = new HashMap<>();
        Node originalNode = head;
        Node cloneNode = cloneHead[0];
        while(originalNode != null && cloneNode != null){
            mapping.put(originalNode, cloneNode);
            originalNode = originalNode.next;
            cloneNode = cloneNode.next;
        }

        originalNode = head;
        cloneNode = cloneHead[0];
        while(originalNode != null && cloneNode != null){
            cloneNode.random = mapping.get(originalNode.random);
            originalNode = originalNode.next;
            cloneNode = cloneNode.next;
        }
        return cloneHead[0];
    }
}