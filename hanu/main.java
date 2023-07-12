import java.util.Scanner;

class main
  { 
    public static void main(String args[])
    {
    int n,m;
    int i,j;
    Scanner  sc = new Scanner(System.in);
    System.out.println("enter the n value");
     n= sc.nextInt();
     System.out.println("enter the m value");
     m= sc.nextInt();
     int[][] a= new int[2][3];
     int[][] b = new int [3][2];
     System.out.println("enter the array:");

     for(i=0;i<2;i++)
     {
    for(j=0;j<3;j++)
      {
         a[i][j]=sc.nextInt();
      }
     }
          

     for(i=0;i<3;i++)
     {
      for(j=0;j<2;j++)
      {
         b[i][j]=sc.nextInt();
      }
     }
     for(i=0;i<2;i++)
     {
    for(j=0;j<3;j++)
      {
         System.out.print(a[i][j]+" ");

      }
      System.out.println();
     }
     for(i=0;i<2;i++)
     {
    for(j=0;j<3;j++)
      {
          System.out.print(b[i][j]+" ");

      }
      System.out.println();
      }
     }


    
    }

  
