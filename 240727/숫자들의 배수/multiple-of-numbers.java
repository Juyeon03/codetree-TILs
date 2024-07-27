import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        int arr[]=new int[10];
        arr[0]=s.nextInt(); 
         System.out.print(arr[0]+" ");
         //이게 그냥 첫 항에다가 1,2,3 곱하는건지 전 항에다가 1,2,3 곱하는건지 구분

            for(int i=1;i<10;i++)
            {
                arr[i]=arr[0]*(i+1);

                if(arr[0]==5&arr[0]==10)
                {
                    System.out.print(arr[0]+" ");
                    System.out.print(arr[1]);
                    break;
                }

                else
                {
                    System.out.print(arr[i]+" ");
                }
            }
    
    }
    
}