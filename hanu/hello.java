import java.util.Scanner;

class hello
{
    public static void main(String args[])
    {
       
       Scanner s_c = new Scanner(System.in);
       int n = s_c.nextInt();
       int c=0;
       int p=0,r=0;
       while(n>0)
       {
        int m=n%10;
         r = (int) (r + m*Math.pow(2, p));
        n=n/10;
        p++;
       }
      
       while(r>0)
       {
       if(r%2==0)
       {
        r=r/2;
       c++;
       }
       else 
       {
         r=r-1;
         c++;
       }
    }

    System.out.println(c);
}
       
    


    }
