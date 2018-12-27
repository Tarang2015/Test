package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/26/2018.
 */
public class CircularSingleLinkedList {
    private int length;
    private CSNode last;

    private class CSNode{
       private int data;
       private CSNode next;

        public CSNode(int data){
            this.data=data;
        }

    }

    public boolean isEmpty(){
        return  length==0;
    }
    public int length(){
        return  length;
    }
    public void createCsList(){
        CSNode f=new CSNode(10);
        CSNode s=new CSNode(30);
        CSNode t=new CSNode(40);
        CSNode fo=new CSNode(50);
        f.next=s;
        s.next=t;
        t.next=fo;
        fo.next=f;
        last=fo;
        length=4;
    }

    public void display(){
        if(last==null){
            System.out.print("List is empty");
        }else {
            CSNode first = last.next;
            while (first != last) {
                System.out.print(first.data + "--> ");
                first = first.next;
            }
            System.out.print(first.data);
        }
    }

    public void insertAtFirst(int data){
        CSNode newNode=new CSNode(data);
        if(last==null){
            last=newNode;
        }else{
        newNode.next=last.next;
        }
        last.next=newNode;
        length++;
    }
    public void insertAtLast(int data){
        CSNode newNode=new CSNode(data);
        if(last==null){
            last=newNode;
            last.next=newNode;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }

        length++;
    }

    public void deleteAtFirst(){
        if(isEmpty()){
            System.out.print("List is empty");
        }
        CSNode temp=last.next;
        if(last.next==last){
            last=null;
        }else{
            last.next=temp.next;
            temp=null;
        }
        length--;
    }
    public void deleteAtLast(){
        if(isEmpty()){
            System.out.print("List is empty");
        }
        CSNode prvTODel=null;
        CSNode temp=last.next;
        if(last.next==last){
            last=null;
        }else{
            while(temp!=last){
                prvTODel=temp;
                temp=temp.next;
            }
            prvTODel.next=temp.next;
            temp=null;
            last=prvTODel;

        }
        length--;




    }
    public void insertAtPos(int data,int pos){
        if( pos>length+1 || pos<1){
            System.out.println("Invalid position");
        }
        if(pos==1){
            insertAtFirst(data);
        }else if(pos==length+1){
            insertAtLast(data);
        }
       CSNode newNode=new CSNode(data);
        int count=1;
        CSNode previous=last.next;
        while(count<pos-1){
            previous=previous.next;
            count++;
        }
        CSNode current=previous.next;
        newNode.next=current;
        previous.next=newNode;
        length++;
    }

    public static void main(String args[]){
        CircularSingleLinkedList cs=new CircularSingleLinkedList();
        cs.createCsList();
        cs.insertAtFirst(5);
        cs.insertAtLast(55);
        cs.display();
        cs.deleteAtFirst();
        System.out.println();
        cs.display();

        System.out.println();
        cs.deleteAtLast();
        cs.display();
        cs.insertAtPos(35,3);
        System.out.println();
        cs.display();

    }
}
