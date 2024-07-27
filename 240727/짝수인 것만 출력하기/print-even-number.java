import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int j=0;
        int a[]=new int[n];
        int b[]=new int[n];
        //일단 b도 n으로 해두기!!

        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();

            if(a[i]%2==0)
            {
                b[j]=a[i];
                j++;
            }
        }
         
        //여기에 등호가 있으면 안됨!!
        for(int i=0;i<j;i++)
        {
            System.out.print(b[i]);
        }
    }
}