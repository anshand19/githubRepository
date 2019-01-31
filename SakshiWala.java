import java.io.*;
import java.util.*;
public class SakshiWala {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.print(ar[0]+ar[1]+ar[2]+ar[3]);
        System.out.print(" ");
        System.out.print(ar[1]+ar[2]+ar[3]+ar[4]);
    }
    
}
