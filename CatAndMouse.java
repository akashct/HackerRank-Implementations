import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int a,b;
        for(int i = 0; i < q; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            a = Math.abs(x-z);
            b = Math.abs(y-z);
            if(a<b){
                System.out.println("Cat A");
            }
            else if(b<a){
                System.out.println("Cat B");
            }
            else if(a==b){
                System.out.println("Mouse C");
            }
        }
    }
}
