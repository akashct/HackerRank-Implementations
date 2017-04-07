import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            // your code goes here
            if(a[i]>37){
            if(a[i]%5==3){
                a[i]=a[i]+2;
                System.out.println(a[i]);
            }
            else if(a[i]%5==4) {
                a[i] = a[i]+1;
                System.out.println(a[i]);
            }
                else {
                    System.out.println(a[i]);
                }
            }
            else
               System.out.println(a[i]); 
        }
    }
}
