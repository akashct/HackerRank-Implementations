import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a = in.nextLine();
        String path = in.nextLine();
        char ch;
        int count=n, sum=0, flag=0;
        for(int i=0;i<path.length();i++){
            ch = path.charAt(i);
            if(ch=='U'){
                count++;
            }
            else if(ch=='D'){
                count--;
            }
            if(count<n&&flag==0){
                flag=1;
            }
            if(count==n&&flag==1){
                sum++;
                flag=0;
            }
        }
        
        System.out.print(sum);
    }
}
