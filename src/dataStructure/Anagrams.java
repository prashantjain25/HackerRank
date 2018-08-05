package dataStructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Anagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        char[] aSide = a.toCharArray();
        char[] bSide = b.toCharArray();
        int counter = 0;
        // int flag=0;
        int[][] temp = new int[a.length() + 1][b.length() + 1];
        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (bSide[j - 1] == aSide[i - 1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                    // counter++;
                    // flag=1;
                }
            }
            // if(flag==1) counter++;
        }
       String xrepo="";
       String yrepo="";
        for (int i = 1; i <= a.length(); i++) {

            for (int j = 1; j <= b.length(); j++) {

                if(temp[i][j] > 0)
                if (!yrepo.toString().contains(bSide[j-1] + "")) {
                    xrepo = xrepo+aSide[i-1];
                    yrepo = yrepo+bSide[j-1];
                    counter += 2;
                } else {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(new File("c://OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        res = a.length() + b.length() - res;
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
