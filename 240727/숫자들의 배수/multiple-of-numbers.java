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
        
        //얜 앞에 빼서 쓰기!!
        if(arr[0]==5&arr[0]==10)
            {
                System.out.print(arr[0]+" ");
                System.out.print(arr[1]);
                //break 문은 반복문이나 switch 문 안에서만 가능!!
            }

        else
        {
             for(int i=1;i<10;i++)
            {
                arr[i]=arr[0]*(i+1);
    
                System.out.print(arr[i]+" ");
                
            }
        }
    
    }
    
}