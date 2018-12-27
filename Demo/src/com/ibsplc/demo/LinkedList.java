package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/14/2018.
 */
public class LinkedList {
    private LinkNode head;
    public void insertAtFirst(int data){
        LinkNode newNode=new LinkNode(data);
        if(head==null){
            head=newNode;
        }else {

            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtLast(int data){
        LinkNode newNode=new LinkNode(data);
        LinkNode current=head;
        if(head==null) {
            newNode.next=head;
            head=newNode;
        }else{
          while(current.next!=null){
              current=current.next;

          }
          current.next=newNode;
        }

    }
    public void insertAtPost(int data,int pos){
        int size=count();
        if( pos>size+1 || pos<1){
            System.out.println("Invalid position");
        }
       if(pos==1){
            insertAtFirst(data);
        }else if(pos==size+1){
            insertAtLast(data);
        }
        LinkNode newNode= new LinkNode(data);
        int count=1;
        LinkNode previous=head;
        while(count<pos-1){
            previous=previous.next;
            count++;
        }
        LinkNode current=previous.next;
        newNode.next=current;
        previous.next=newNode;

    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("No node to delete");
        }
        LinkNode temp=head;
        head=head.next;
        temp.next=null;
    }

    public void deleteLast(){
        LinkNode last=head;
        LinkNode previousToLast=null;
        if(head==null){
            System.out.println("No node to delete");
        }
        while(last.next!=null){
            previousToLast=last;
           last=last.next;
        }
        previousToLast.next=null;
    }
    public void deleteAtPos(int pos){

        LinkNode previous=head;
        int count=1;
        while(count<pos-1){
            previous=previous.next;
            count++;
        }

        LinkNode current=previous.next;
        previous.next=current.next;
        current.next=null;


    }
    public boolean search(int key){
        LinkNode current=head;
        while(current!=null){
            if(current.data==key){
                return  true;
            }
            current=current.next;

        }
        return false;
    }
    public void display(){
        LinkNode current=head;
        while(current!=null){
            System.out.print(current.data +"-->");
            current=current.next;
        }
        System.out.print(current);
    }
    public int count(){
        LinkNode current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void getMiddlElement(){
        LinkNode slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while(fastPointer !=null) {
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
System.out.println("Middle element "+ slowPointer.data);
    }
    public static void main(String args[]){
        LinkedList list=new LinkedList();

        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtFirst(5);
        list.insertAtFirst(19);
        list.insertAtLast(25);
        list.insertAtPost(40,4);
        list.insertAtPost(50,3);
        System.out.println("The total size of linked list before deleting :" +list.count());
        list.display();
        list.getMiddlElement();
        System.out.println();

        list.deleteFirst();
        System.out.println();
        list.display();
        list.deleteLast();
        System.out.println();
        list.display();
        System.out.println();
        list.deleteAtPos(4);
        System.out.println();
        list.display();
        System.out.println();
        System.out.println("The total size of linked list after deleting :" +list.count());
        if(list.search(76)){
            System.out.print("found");
        }else{
            System.out.print(" Not found");
        }

        list.getMiddlElement();

    }
}
