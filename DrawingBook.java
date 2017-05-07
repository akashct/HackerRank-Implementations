import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        if(p==1||p==n){
            return 0;
        }
        
        if(n%2!=0&&p==(n-1)){
            return 0;
        }
        
        if(n%2==0&&p==(n-1)){
            return 1;
        }
        
        int a= p/2;
        
        int b= (n-p)/2;
        
        if(a>b){
            return b;
        }
        else return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
