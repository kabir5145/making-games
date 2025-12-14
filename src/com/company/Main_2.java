package com.company;

public class Main_2 {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

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

    //Finding the middle node in the singly linked list
    public int findMiddleNode(){
        if(head == null){
            return 0;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }

    //Reversing the singly linked list
    public void reverseList(){
        if(head == null){
            return;
        }
        ListNode current = head;
        ListNode pre = null;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        head = pre;
    }

    //Inserting the node at the beginning of the singly linked list
    public ListNode insertNodeAtFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        return newNode;
    }
    public static void main(String[] args) {
        Main_2 main = new Main_2();
        main.head = new ListNode(10);
        main.head.next = new ListNode(8);
        main.head.next.next = new ListNode(1);
        main.head.next.next.next = new ListNode(11);

        main.printList();
        System.out.println(main.findMiddleNode());

        main.reverseList();
        main.printList();

        main.insertNodeAtFirst(100);
        main.printList();
    }
}