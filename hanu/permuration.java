
import java.util.*;
public class permuration
 {
   static void operation(char[] arr,int fi)
   {
    if(fi==arr.length-1)
    {
        System.out.println(arr);

        
        return;
    }
    for( int i=fi;i<arr.length;i++)
    {
        swap(arr,fi,i);
        operation(arr,fi+1);
        swap(arr,fi,i);
    }
   }  
   static void swap(char[] arr,int fi,int i)
   {
    char temp= arr[i];
    arr[i]= arr[fi];
    arr[fi]=temp;

   }


    
 public static void main(String args[])
 {

  Scanner sc = new Scanner(System.in);
  System.out.println("enter the string:");
  String s =sc.nextLine();
  operation(s.toCharArray(),0);
  
  

 }



    
}
