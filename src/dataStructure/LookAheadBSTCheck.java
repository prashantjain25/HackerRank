package dataStructure;

public class LookAheadBSTCheck {
    class Node {
        int data;
        Node left;
        Node right;
     }
    public static void main(String[] args) {
        //Best way to check a BST

    }
    boolean checkBST(Node root) {
        boolean result=isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
       return result?true:false;
        
     }
 boolean isBST(Node n, int min, int max){
  if(n==null) return true;
   if(n.data<min||n.data>max){
     return false;
   }
   return (isBST(n.left,min,n.data-1) && isBST(n.right, n.data+1,max));
  
     }
}
