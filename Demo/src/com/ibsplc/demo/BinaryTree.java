package com.ibsplc.demo;

import java.util.Stack;

/**
 * Created by A-8677 on 12/15/2018.
 */

class BNode{
     int data;
     BNode left;
     BNode right;
     public BNode(int data){
         this.data=data;
         this.left=null;
         this.right=null;
     }
    boolean isLeaf() {
        return left == null ? right == null : false;
    }
}

class BinaryFunction{
   BNode root;
   public void insert(int data)
   {
       root=insert(root,data);
   }

   private BNode insert(BNode node,int value){
       if(node==null){
           return new BNode(value);
       }
           if(value<node.data){
               node.left=insert(node.left,value);
           }else if(value>node.data){
               node.right=insert(node.right,value);
           }
return node;
   }
   public void inOrder(){
       inOrder(root);
   }
   private void inOrder(BNode node){
       if(node!=null){
           inOrder(node.left);
           System.out.print(" "+ node.data);
           inOrder(node.right);
       }
   }

   public void inOrderWRecursion(){
       Stack<BNode> s=new Stack<>();
       BNode current=root;
       while(!s.isEmpty() || current!=null){
           if(current!=null){
               s.push(current);
               current=current.left;
           }else{
               BNode node=s.pop();
               System.out.print(" " + node.data);
               current=node.right;
           }
       }
   }
   public void preOrder(){
       preOrder(root);
   }
   private void preOrder(BNode node){
       if(node!=null){
           System.out.print(" "+ node.data);
           preOrder(node.left);
           preOrder(node.right);
       }
   }

   public void prOrdeWRecursion(){
       if(root==null) return;
       Stack<BNode> s=new Stack<BNode>();
       s.push(root);
       while(!s.isEmpty()){
           BNode current=s.pop();
           System.out.print(" " + current.data);
           if(current.right!=null){
               s.push(current.right);
           }
           if(current.left!=null){
               s.push(current.left);
           }
       }


   }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(BNode node){
        if(node!=null){

            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" "+ node.data);
        }
    }

public void postOrderWRecursion(){
        Stack<BNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
         BNode current=s.peek();
         if(current.isLeaf()){
             BNode node=s.pop();
             System.out.print(" " + node.data);
         }else{

             if(current.right!=null){
                 s.push(current.right);
                 current.right=null;
             }if(current.left!=null){
                 s.push(current.left);
                 current.left=null;
             }
         }

        }
}



    public boolean search(int val){
        return search(root,val);
    }
    private boolean search(BNode root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        return val<root.data?search(root.left,val):search(root.right,val);

    }
    public int countNodes(){
        return  countNodes(root);
    }

    private int countNodes(BNode root){
        if(root==null){
            return 0;
        }
        int count=1;
        if(root.left!=null){
            count+=countNodes(root.left);
        }if(root.right!=null){
            count+=countNodes(root.right);
        }
        return count;
            }

            public   void deleteKey(int val){
       root= deleteKey(root,val);
            }
            private BNode deleteKey(BNode root,int val){
                if(root==null) return null;
                if(val<root.data){
                    root.left=deleteKey(root.left,val);
                }else if(val>root.data){
                    root.right=deleteKey(root.right,val);
                }else{
                    if(root.left==null && root.right==null ){
                        return null;
                    }else if(root.left==null){
                        return root.right;
                    }else if(root.right==null){
                        return root.left;
                    }else{
                        Integer minValue = minValue(root.right);
                        root.data=minValue;
                        root.right=deleteKey(root.right, minValue);
                    }
                }
                return root;
            }

    private Integer minValue(BNode node) {

        if(node.left != null) {
            return minValue(node.left);
        }
        return node.data;
    }

    public void printLeaves(){
        root=  printLeaves(root);
    }

    private BNode printLeaves(BNode node){
        if(node==null){
            return null;
        }
        if(node.isLeaf()){
            System.out.print(" " + node.data);
        }
        node.left=printLeaves(node.left);
        node.right=printLeaves(node.right);
        return node;
    }

}
public class BinaryTree {
    public static  void main(String args[]){
        BinaryFunction function=new BinaryFunction();
        function.insert(8);
        function.insert(10);
        function.insert(14);
        function.insert(3);
        function.insert(6);
        function.insert(7);
        function.insert(1);
        function.insert(4);
        function.insert(13);
        //function.postOrderWRecursion();
        System.out.println("leaves");
        function.printLeaves();
        System.out.println();
        function.inOrderWRecursion();
        function.prOrdeWRecursion();
        function.deleteKey(3);
        System.out.print("Inorder traverse:  ");
        function.inOrder();
        System.out.println();
        System.out.print("pre order traverse:  ");
        function.preOrder();
        System.out.println();
        System.out.print("post order traverse:  ");
        function.postOrder();
        System.out.println();
        System.out.print(function.search(17));
        System.out.println();
        System.out.println(function.countNodes());

    }
}
