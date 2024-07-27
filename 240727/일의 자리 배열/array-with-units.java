import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        //나오는 형식이 사소한 것들에 의해 많이 달라진다!!
        Scanner s=new Scanner(System.in);

        int arr[]=new int[11];

        arr[0]=s.nextInt();
        arr[1]=s.nextInt();

        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");

        for(int i=2;i<10;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];

            if(arr[i]>=10)
            {
                arr[i]=arr[i]-10;
            }

            System.out.print(arr[i]+" ");
        }
    }
}