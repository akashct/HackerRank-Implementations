import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(((x1>x2)&&(v1>v2))||(x2>x1)&&(v2>v1)){
            System.out.print("NO");
        }
        else {
            for(int i=0;i<=10000;i++) {
                if(x1==x2){
                    System.out.print("YES");
                    System.exit(0);
                }
                else {
                    x1=x1+v1;
                    x2=x2+v2;
                    i++;
                }
            }
            System.out.print("NO");
              
        }
    }
        
}
