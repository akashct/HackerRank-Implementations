import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
 
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        
       int count, sell=0;
      for(int i = 0; i<n-1 ; i++){
            if(c[i]==c[i+1] ){
                sell++;
                i++;
            }
      }
        System.out.print(sell);
    }
}
