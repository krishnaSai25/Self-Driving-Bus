import java.io.*;
import java.util.*;

public class SelfBus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,i,j,temp,temp2;
        num=sc.nextInt();
        int[][] arr=new int[num][3];
        for(i=0;i<num;i++)
        {
        arr[i][0]=i+1;
        }
        int ele=0;
        int m=1;
        int op=0;
        for(i=0;i<num-1;i++)
        {
                temp=sc.nextInt()-m;
                temp2=sc.nextInt()-m;
            if(arr[temp][1]==0&&arr[temp2][1]!=0)
            {
                arr[temp][1]=arr[temp2][1];
            }
            else if(arr[temp][1]==0&&arr[temp2][1]==0)
            {
                arr[temp][1]=ele+1;
                arr[temp2][1]=ele+1;
                ele++;
            }
            else if(arr[temp][1]!=0&&arr[temp2][1]==0)
            {
                arr[temp2][1]=arr[temp][1];
            }
        }
        op=num;
        System.out.println(2*num-1);
    }
}
