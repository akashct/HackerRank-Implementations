import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        String leap = "12.09.";
        String nleap = "13.09.";
        String result;
        if(year>1918){
            if((year%400)==0||((year%4==0)&&(year%100)!=0)){
                result = new String(leap);
                result = result.concat(Integer.toString(year));
                return result;
            }
            else {
                result = new String(nleap);
                result = result.concat(Integer.toString(year));
                return result;
            }
        }
        
        else if(year<1918){
            if(year%4==0){
               result = new String(leap);
                result = result.concat(Integer.toString(year));
                return result; 
            }
            else {
                result = new String(nleap);
                result = result.concat(Integer.toString(year));
                return result;
            }
        }
        
        else if(year==1918){
            result = new String("26.09.");
            result = result.concat(Integer.toString(year));
            return result;
        }
        else {
            return "0";
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
