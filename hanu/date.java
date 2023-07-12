import java.util.*;

public class date
{  
  

        static int  operation(int arr[],int n)
        {
            for(int i=0;i<10;i++)
            {
                if(arr[i]==n)
                return i;
            }
            return -1;

        }    
       public static void main(String[] args)
    {
       
      Scanner sc = new Scanner(System.in);
      int arr[]={1,2,3,4,5,6,7};
      for(int i=0;i<arr.length;i++)
      {
           System.out.print(arr[i]);
      }
      System.out.println();
      System.out.println("print the element to be find");
      int n = sc.nextInt();
      int result= operation(arr, n);
      if(result!=-1)
      {
      System.out.println("mtch is found "+ n + " "+ "in" +" " + result +" " + "index");
      }
      else
      {
        System.out.println("match is not there");
      }


    }
}