package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/26/2018.
 */
public class DoubleLinkedList {
    private DoubleNode head,tail;
    int length;
    private class DoubleNode{
        int data;
        DoubleNode next;
        DoubleNode previous;


        public DoubleNode(int data){
            this.data=data;
            this.next=next;
            this.previous=previous;
        }
    }
    public boolean isEmpty(){
       return  length==0;
    }
    public int size(){
        return  length;
    }


    public void displayForward(){
        if(head==null){
            System.out.println("list is empty");

        }
        DoubleNode current=head;
        while(current!=null){
            System.out.print(current.data +"-->");
            current=current.next;
        }
        System.out.print("null");
    }

    public void displayBackward(){

        if(tail==null){
            System.out.println("list is empty");
        }
        DoubleNode current=tail;
        while(current!=null){
            System.out.print(current.data + "-->");
            current=current.previous;
        }
        System.out.print("null");
    }

    public void insertAtFirst(int data){
        DoubleNode newNode=new DoubleNode(data);
        if(head==null){
            tail=newNode;

        }else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }

    public void insertAtLast(int data){
        DoubleNode newNode=new DoubleNode(data);
        if(tail==null){
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;
    }

    public void insertAtPos(int data,int pos){
        if(pos<1 || pos>length+1){
            System.out.print("invalid position");
        }
        DoubleNode newNode=new DoubleNode(data);
        if(pos==1){
            if(head==null){
                tail=newNode;
            }else{
                head.previous=newNode;
            }
            newNode.next=head;
            head=newNode;
            length++;
        }
        if(pos==length+1){
            if(tail==null){
                head=newNode;
            }else{
                tail.next=newNode;
                newNode.previous=tail;
            }
            tail=newNode;
            length++;
        }else if(pos>1 && pos<length){
            int count=1;
            DoubleNode posPrv=head;
            while(count<pos-1){
                posPrv=posPrv.next;
                count++;
            }
            DoubleNode next=posPrv.next;
            posPrv.next=newNode;
            newNode.next=next;
            next.previous=newNode;
            newNode.previous=posPrv;
            length++;
        }
    }

    public void deleteAtFirst(){
        if(head==null){
            System.out.print(" List is empty");
        }
        if(head==tail){
           tail=null;
        }else{
            head.next.previous=null;
        }
        DoubleNode temp=head;

        head=head.next;
        temp=null;
        length--;

    }
    public void deleteAtLast(){
        if(tail==null){
            System.out.print(" List is empty");
        }
        if(head==tail){
            head=null;
        }else{
            tail.previous.next=null;
        }
        DoubleNode temp=tail;
        tail=tail.previous;
        temp=null;
        length--;
    }
    public void deleteAtPos(int pos){
        if(pos<1 || pos>length+1){
            System.out.print("invalis position");
        }
      int count=1;
        DoubleNode delPrvNode=head;
        while(count<pos-1){
            delPrvNode=delPrvNode.next;
            count++;
        }
        DoubleNode nextToCurrent=delPrvNode.next;
       // delPrvNode.next=null;
        delPrvNode.next=nextToCurrent.next;
        nextToCurrent.next.previous=delPrvNode;
        nextToCurrent.next=null;
        length--;
    }

    public static void main(String args[]){
        DoubleLinkedList ddl=new DoubleLinkedList();

        ddl.insertAtFirst(10);
        ddl.insertAtFirst(20);
        ddl.insertAtFirst(30);
        ddl.insertAtLast(40);
        ddl.insertAtLast(50);
        ddl.insertAtFirst(60);


        ddl.insertAtPos(70,1);
        ddl.insertAtPos(80,8);
        ddl.insertAtPos(15,6);
        ddl.deleteAtPos(6);
        ddl.displayForward();
        System.out.println();
        ddl.displayBackward();
        ddl.deleteAtFirst();


        System.out.println();
        ddl.displayForward();
        System.out.println();
        ddl.displayBackward();
        System.out.println();
        ddl.deleteAtLast();

        System.out.println();
        ddl.displayForward();
        System.out.println();
        ddl.displayBackward();

    }

}
