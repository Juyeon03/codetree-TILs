import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        //기본 개념 참고!!
        //저게 맞나?? char는 저렇게 받는구나!! 화이팅

        char lebros[]=new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char get=s.next().charAt(0);

        int idx=-1;

        if(get=='L')
        {
            idx=0;
        }

        if(get=='E')
        {
            idx=1;
        }

        if(get=='B')
        {
            idx=2;
        }

        if(get=='R')
        {
            idx=3;
        }

        if(get=='O')
        {
            idx=4;
        }

        if(get=='S')
        {
            idx=5;
        }

        if(idx==-1)
        {
            System.out.print("None");
        }

        else
        {
            System.out.print(idx);
        }
    }
}