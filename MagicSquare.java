import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[][][] matrix_main={
    {{8,1,6},{3,5,7},{4,9,2}},
    {{6,1,8},{7,5,3},{2,9,4}},
    {{4,9,2},{3,5,7},{8,1,6}},
    {{2,9,4},{7,5,3},{6,1,8}},
    {{8,3,4},{1,5,9},{6,7,2}},
    {{4,3,8},{9,5,1},{2,7,6}},
    {{6,7,2},{1,5,9},{8,3,4}},
    {{2,7,6},{9,5,1},{4,3,8}},
};
        int min_cost = 81;
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
     for(int k=0;k<8;k++)
{
    int cost=0;
   for(int i=0;i<3;i++)
       for(int j=0;j<3;j++)
           cost+=Math.abs(s[i][j]-matrix_main[k][i][j]);
if(min_cost>cost)
    min_cost=cost;
}
System.out.print(min_cost);                          
        
    }
}
