import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        int arr[]=new int[100];
        int a=0;
        arr[0]=1;
        arr[1]=s.nextInt();

        for(int i=2;i<100;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
            a++;


            if(arr[i-1]>=100)
            {
                break;
            }
        }

        for(int i=0;i<=a;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}