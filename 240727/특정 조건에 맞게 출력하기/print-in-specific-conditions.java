import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        //이거는 잘 모르겠어서 그냥 좀 베낌!!
        //새로운 배열 생성!!
        Scanner s=new Scanner(System.in);
        int Arr[]=new int[100];
        int newArr[]=new int[100];
        int zeroPoint=0;

        for(int i=0;i<100;i++)
        {
            Arr[i]=s.nextInt();

            if(Arr[i]==0)
            {
                //밑에서 나옴!! 100으로 해도 print 안하면 되군...
                zeroPoint=i;
                break;
            }

            if(Arr[i]%2==0)
            {
                newArr[i]=Arr[i]/2;
            }

            if(Arr[i]%2!=0)
            {
                newArr[i]=Arr[i]+3;
            }
        }

        //0이 나오기 전까지의 배열의 인덱스에 저장된 값 출력!!
        for(int i=0;i<zeroPoint;i++)
        {
            System.out.print(newArr[i]+" ");
        }

        //NoSuchElementException은 입력이 예상보다 일찍 종료되어 
        //Scanner가 더 이상 읽을 요소가 없을 때 발생합니다.
    }
}