import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[100];

        for(int i=0;i<100;i++)
        {
            arr[i]=s.nextInt();

            if(arr[i]==0)
            {
                continue;
            }

            if(arr[i]%2==0)
            {
                int b=arr[i]/=2;
                System.out.print(b+" ");
            }

            if(arr[i]%2!=0)
            {
                int c=arr[i]+=3;
                System.out.print(c+" ");
            }
        }
        
        //NoSuchElementException은 입력이 예상보다 일찍 종료되어 
        //Scanner가 더 이상 읽을 요소가 없을 때 발생합니다.
    }
}