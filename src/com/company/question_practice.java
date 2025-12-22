package com.company;

public class question_practice {
    private ListNode head;

    private static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Printing the singly linked list
    public void printList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //Insert a Node at the Tail of a Linked List
    static ListNode insertNodeAtTail(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return head;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        //Printing the singly linked list
        question_practice q = new question_practice();
        q.head = new ListNode(10);
        q.head.next = new ListNode(20);
        q.head.next.next = new ListNode(30);

        q.printList();

        q.insertNodeAtTail(q.head, 10);
        q.printList();
    }
}
