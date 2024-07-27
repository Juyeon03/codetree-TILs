import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        int arr[]=new int[10];
        //초기화 할때는 int 쓰면 안된다!!
        arr[0]=s.nextInt();
        arr[1]=s.nextInt();

        for(int i=0;i<8;i++)
        {
            arr[i+2]=arr[i+1]+2*arr[i];
        }
        //런타임 에러 주의!!

        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}