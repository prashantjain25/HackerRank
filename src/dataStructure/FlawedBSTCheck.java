package dataStructure;

import java.util.LinkedList;

public class FlawedBSTCheck {
        class Node {
            int data;
            Node left;
            Node right;
         }
    public static void main(String[] args) {
      // This classs represents flawed solution

    }
    LinkedList temp=new LinkedList();
    boolean checkBST(Node root) {
         
        Node q=root; 
       System.out.println(q.data );
        if(temp.contains(q.data)) {
         
            return false;
        }
        temp.add(q.data);
        if(q.left!=null) {
          System.out.println(q.data+"->left "+q.left.data);
          if((q.left.data<=q.data) && (q.left.data>(Integer)temp.get(0))){
             
               checkBST(q.left);
          }
                else return false;  
    }
          
        
       if(q.right!=null){
          System.out.println(q.data+"->right "+q.right.data);
            if((q.right.data>q.data) && (q.right.data>(Integer)temp.get(0)))
            { 
              checkBST(q.right);
            }
             else return false;
    }
    if(!(q.left!=null) && !(q.right!=null)){
      return false;
    } else
        
     //System.out.println(q.data);
        return true;
    }

}
