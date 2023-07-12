import java.util.*;
class gain
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[][]= new int[3][3];
        int x=1,y=1;
        int i,j;
        for(i=0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for( i=0;i<3;i++)
        {
            if(a[i][0]==0)
            x=0;
        }
        for( j=0;j<3;j++)
        {
            if(a[0][j]==0)
            y=0;
        }
        for (i=0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                if(a[i][j]==0)
                {
                    a[0][j]=0;
                    a[i][0]=0;
                }
            }
        }
        for( i=0;i<3;i++)
        {
            if(a[0][j]==0)
            {
                for( j=0;j<3;j++)
                {
                      a[i][j]=0;
                      System.out.print(a[i][j]) ;               }
            }
            System.out.println();
        }
        for( j=0;j<3;j++)
        {
            if(a[i][0]==0)
            {
                for( i=0;i<3;i++)
                {
                      a[i][j]=0;
                      System.out.print(a[i][j]) ;               }
            }
             System.out.println();
        }
        if(x==0)
        {
        for( i=0;i<3;i++)
        {
            a[i][0]=0;
            System.out.print(a[i][0]);
        }
    }
    if(y==0)
    {
        for( j=0;j<3;j++)
        {
             System.out.print(a[0][j]);

        }
    }
}
}

                