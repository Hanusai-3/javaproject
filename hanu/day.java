import java.util.Scanner;

class day
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int c=2;
        while(n<=1)
        {
            System.out.println("prime or composite");
        }
        while(c<=n)
        {
            if(n%c==0)
            {
                System.out.println("not prime");
                c++;
            }
            else System.out.println("prime");
    }

        }
       
}