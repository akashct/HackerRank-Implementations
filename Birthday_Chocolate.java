import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m, int n){
        // Complete this function
        int count=0, sum;
        for(int i=0;i<(n-m)+1;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum = sum+squares[i+j];
            }
            if(sum==d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        if(n<1){
            System.out.print("0");
            System.exit(0);
        }
        if((n==1)&&(s[0]==d)&&(m==1)){
            System.out.print("1");
            System.exit(0);
        }
        int result = getWays(s, d, m, n);
        System.out.println(result);
    }
}
