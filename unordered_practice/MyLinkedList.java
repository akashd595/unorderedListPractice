package com.bridgelabz.unordered_practice;


public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
//        this.head = key;
    }

    public void add(INode<K> node) {
        System.out.println(node);
        INode<K> tempNode = node;
        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.seNext(tempNode);
            tail = tempNode;
        }

    }
    public void addLast(INode<K> node) {
        INode<K> tempNode = node;
        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            tempNode.seNext(head);
            head = tempNode;
        }
    }
    public void addMiddle(INode<K> node) {
        INode<K> newNode = node;
        INode<K> oldNode = node;

        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            oldNode= head.getNext();
            head.seNext(newNode);
            newNode.seNext(oldNode);
        }
    }//addMiddle
    public void deleteFirst(){
        if(head==null){
            System.out.println("LinkedList is already empty ");
            return;
        }
        head=head.getNext();
    }//deleteFirst
    public void deleteLast(){
        if(head==null){
            System.out.println("LinkedList is already empty ");
            return;
        }
        INode<K> tempNode;
        tempNode = head;
        while(tempNode.getNext() != tail){
            tempNode = tempNode.getNext();
        }
        tempNode.seNext(null);
        tail=tempNode;
    }
    public void searching(INode<K> node){
        if(head==null){
            System.out.println("LinkedList is already empty ");
            return;
        }
        INode<K> tempNode=head;
        boolean check=false;

        while(tempNode != null){
            System.out.println("-->> "+tempNode.getKey());
            K data1 = tempNode.getKey();
            K data2 = node.getKey();
            if(data1.equals(data2)){
                System.out.println("30 is present in the list");
                check = true;
                return;
            }
            tempNode = tempNode.getNext();
        }//end while

        if(check == false){
            System.out.println("30 not found in the list");
        }
    }

    public void printList(){
        System.out.println("MyNode "+head);
    }
    public static void main(String[] args) {
        MyLinkedList<Integer> listNode = new MyLinkedList<>();

        MyNode<Integer> node = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(70);
        MyNode<Integer> node3 = new MyNode<>(30);
        MyNode<Integer> node4 = new MyNode<>(40);
//        MyNode<Integer>[] arrint = {new MyNode<>(56), new MyNode<>(57),new MyNode<>(56)};
        MyNode<Integer>[] arrint = new MyNode[10];
        Integer[] arrTraver = {1,2,3,4,5};

        MyNode<Integer>[] arr = arrint;
        for (Integer index : arrTraver){
            System.out.println(arrint[index]);
            listNode.add(arrint[index]);
        }
        listNode.printList();

    }
}
