import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        int high,low,loose=0,win=0;
        s[0] = in.nextInt();
        high=low=s[0];
        for(int s_i=1; s_i < n; s_i++){
            s[s_i] = in.nextInt();
            if(s[s_i]>high){
                high=s[s_i];
                win++;
            }
            else if(s[s_i]<low){
                low=s[s_i];
                loose++;
            }
        }
        
        System.out.print(win+" "+loose);
       
    }
}
