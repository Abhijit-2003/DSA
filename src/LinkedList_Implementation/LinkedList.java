package LinkedList_Implementation;

public class LinkedList
{
    // Create a Node in LL
    static class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    // print LL
    static void printList(Node head)
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }

        System.out.print("NULL");
    }

    public static  void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);
    }
}
