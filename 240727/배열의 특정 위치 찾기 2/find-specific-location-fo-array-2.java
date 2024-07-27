import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        int array[]=new int[10];
        int sum1=0;
        int sum2=0;

        //이게 배열 값을 입력받을 때는 한번에 하고,
        //나중에 더할 때 따로 되게!! 
        //그리고 if~else 문!!

        for(int i=0;i<10;i++)
        {
            array[i]=s.nextInt();

            if(i%2==0)
            {
                sum1+=array[i];
            }

            else
            {
                sum2+=array[i];
            }
        }

        if(sum1>=sum2)
        {
            System.out.print(sum1-sum2);
        }

         else
        {
            System.out.print(sum2-sum1);
        }

    }
}