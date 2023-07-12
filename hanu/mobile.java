import java.util.Scanner;
class mobile
{
   public static void main(String args[])
   {
       int n,m;
       Scanner sc = new Scanner(System.in);
       
       String s=sc.nextLine();
       n= sc.nextInt();
       m=n%7;
       int p= sc.nextInt();
       try{
          int o= p;
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
       switch (m) 
       {
       case 1: System.out.println("mon");
            
            break;
       case 2: System.out.println("tue");
            
            break;
       
            case 3: System.out.println("wed");
            
            break;
       case 4: System.out.println("thur");
            
            break;
       case 5: System.out.println("fri");
            
            break;
       case 6:  System.out.println("mon");
            
            break;
       
          
       
         default: System.out.println("mon");
            
         
       
            break;
       }
       

   }
}