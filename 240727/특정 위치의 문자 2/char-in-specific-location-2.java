import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        char [] array=new char[10];
        //자바에서 char는 소문자!!
        
        for(int i=0;i<10;i++)
        {
            array[i]=s.next().charAt(0);
            //이런 형태는 첨보네!!
        }

        for(int i=1;i<10;i=i+3)
        {
            System.out.print(array[i]+" ");
        }
    }
}