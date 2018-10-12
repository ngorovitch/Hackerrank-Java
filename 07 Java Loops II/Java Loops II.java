import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res=0;
            res += a + (int) (Math.pow(2,0)*b);
            System.out.print(res+" ");
            for(int j=1;j<n;j++)
                {
                 res = res + (int) (b*Math.pow(2,j));
                    System.out.print(res+" ");
                 }
            System.out.println();
            res=0;

         
        }
        in.close();
        }
}