import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int array[]=new int[9];
        
        for(int i=0;i<9;i++)
        {
            array[i]=s.nextInt();

            if(array[i]==0&&i>=3)
        {
            System.out.print(array[i-1]+array[i-2]+array[i-3]);
            break;
            ///또 0이 나올수도 있으니 나가야함... i>=3부터임...
        }
        }
    }
}