import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int count=0,flag;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        for(int i=a[n-1];i<=b[0];i++){
             flag=1;
            for(int j=0;j<n;j++){
                if(i%a[j]!=0){
                    flag=0;
                }
            }
            for(int j=0;j<m;j++){
                if(b[j]%i!=0){
                    flag=0;
                }
             }
            if(flag==1){
                    count++;
            }
         }
        System.out.print(count);
    }
}
