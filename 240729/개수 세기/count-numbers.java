import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt(); 

        int cnt=0; 
        int array[]=new int[n]; 


        for(int i=0;i<n;i++)
        {
           array[i]=s.nextInt(); 
        }


        for(int i=0;i<n;i++)
        {
            if(array[i]==m)
            {
                cnt++;
            }
        }


        System.out.print(cnt);
    }
}