import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        int arr[]=new int[10];
        arr[0]=s.nextInt(); 
      
        //이게 그냥 첫 항에다가 1,2,3 곱하는건지 전 항에다가 1,2,3 곱하는건지 구분
        
        for(int i=1;i<10;i++)
        {
            arr[i]=arr[0]*(i+1);
        }

        int add=0;
        //지금까지 이걸 반복문 안에 넣어서 계속 초기화 되버림!!

        //이걸 한번 더 써야됨!!
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");

            if(arr[i]%5==0)
            {
                add++;
            }

            if(add>=2)
            {
                break;
            }
        }
        
    }
    
}