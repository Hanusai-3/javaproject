
import java.util.*;
public class amstrong 
{
    
    static int l;
  
    static int  r;
    static int digit=0;
    static double result=0;
           static  int m;;

   
    static boolean operation(int w)
    { 
        int result=0;
        r=w;
                    
         while(r>0)
         {
            r=r/10;
             digit++;
         }


        r=w;
    
        while(r>0)
        {
           
         m=r%10;
         result=(int)( result+Math.pow(m,digit));
         r=r/10;
        }
        
        
    
    if(w==result)
    {
        return true;

    }
    else
    {
        return false;
    }
}
    public static void main(String args[])
    {
        int n; 
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
   
       
       for(int i=1;i<=n;i++)
       {
        if( operation(i))
        {
            System.out.print(i + " ");
        }
       }



}
}
