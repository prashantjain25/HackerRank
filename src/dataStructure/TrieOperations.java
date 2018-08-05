package dataStructure;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class TrieOperations {
    class TrieNode{
        LinkedHashMap<Character, TrieNode> children;

        public LinkedHashMap<Character, TrieNode> getChildren() {
            return children;
        }

        public void setChildren(LinkedHashMap<Character, TrieNode> children) {
            this.children = children;
        }
        boolean isEndOfWord=false;
        Character letter;
        
      } 


      private static final Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
          int n = scanner.nextInt();
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          for (int nItr = 0; nItr < n; nItr++) {
              String[] opContact = scanner.nextLine().split(" ");

              String op = opContact[0];

              String contact = opContact[1];
              boolean result;
              if(op.equals("find"))
                result=  find(contact);
            if(op.equals("add")){
              add(contact);
            }
          }
        
          scanner.close();
      }
    static boolean find(String contact){
      return true;
    }
    static void add(String contact){
        LinkedHashMap<Character,TrieNode> children=new LinkedHashMap<>();
        int counter=0;
      for(Character ch:contact.toCharArray()) {
              counter++;
      children.put(ch,new TrieOperations().new TrieNode());
      if(counter==contact.length()-1) {
          children.get(ch).isEndOfWord=true;
          }
      }
  
      TrieNode trieNode=new TrieOperations().new TrieNode();
      trieNode.setChildren(children);
      trieNode.letter=(char)contact.indexOf(0);
      
    }
    
    static void add(char[] contact) {
        
    }
}
