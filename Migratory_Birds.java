import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n+1];
        int[] count = new int[n+1];
        for(int i=1;i<=n;i++){
            count[i]=0;
        }
        for(int types_i=1; types_i <= n; types_i++){
            types[types_i] = in.nextInt();
            count[types[types_i]]++;
        }
        // your code goes here
        int max=0;
        for(int i=1;i<=n;i++){
            if(count[i]>max){
                max=count[i];
            }
        }
        int x=0;
       for(int i=1;i<=n;i++){
          if(count[i]==max){
              if(x==0){
              x=i;
              }
              else if(i<x){
                  x=i;
              }
            
          }
       }
        
        System.out.print(x);
        
        
        
    }
}
