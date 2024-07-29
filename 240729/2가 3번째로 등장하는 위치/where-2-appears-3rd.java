import java.util.*; 

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array[]=new int[n];
        int cnt=0;

        for(int i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(array[i]==2)
            {
                cnt++;

                if(cnt==3)
                {
                    //순서 프린트 할 때는 i+1!! 
                    System.out.print(i+1);
                    break;
                }
            }
        }

    }
}