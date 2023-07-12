import java.util.*;


public class hanu {
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int[] a= new int[10];
        for(int i=0;i<5;i++)
        {
             a[i]= sc.nextInt();
        }
        
        int l = a.length;
         for(int m=0;m<l;m++)
         {
            for(int j=m+1;j<l;j++)
            {
                if(a[m]>a[j])
                {
                    int temp=a[m];
                    a[m]=a[j];
                    a[j]=temp;
                }
            }
        }
            for(int m=0;m<l;m++)
         {
           
                System.out.print(a[m]+" ");
            }
        


}        



    }
    

