package dataStructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramsEfficient {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(new File("c://OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        //res = a.length() + b.length() - res;
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    private static int makeAnagram(String a, String b) {
       char[] str1= a.toCharArray();
       char[] str2= b.toCharArray();
       for(int x=0; x<str1.length;x++)
       {
           for(int y=0;y<str2.length;y++) {
               if(str1[x]==str2[y] && str1[x]!='\0' && str2[y]!='\0') {
                  // System.out.println(x+" "+y);
                   str1[x]='\0';
                   str2[y]='\0';
               }
           }
       }
       int count=0;
       for(int x=0; x<str1.length;x++)
       {
           if(str1[x]=='\0') {
               count++;
           }
           
           }
       for(int x=0; x<str2.length;x++)
       {
           if(str2[x]=='\0') {
               count++;
           }
           }
      // System.out.println(count);
        return str1.length+str2.length-count;
    }
}
