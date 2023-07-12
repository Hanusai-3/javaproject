import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("here few info for user........");
        System.out.println("operation is based on pressing the character");
        System.out.println("if you press'a' its leads to arithmatic operation..");
        System.out.println("if you press 'x' its leads to bitwise operation...");
        System.out.println("if you press 'b' its leads to logarthmic operation...");
        System.out.println("if you press 'f' its leads to find smallest of 3 numbers..");
        System.out.println("if you press 'e' its leads to find smallest of 3 numbers..");
        System.out.println("if you press 'y' leads to the number is amstrong or not..");
        System.out.println("if you press 'z' its leads to reverse a number...");


       
        System.out.println("enter the character to perform the operation");
        char first= sc.next().trim().charAt(0);

        //for 'a'  arithmatic operation process..........
        if(first=='a'){
         System.out.println("enter the character :");
        char ch= sc.next().trim().charAt(0);
        System.out.println("enter the first number :");
        int num1= sc.nextInt();
        System.out.println("enter thr second number:");
        int num2= sc.nextInt();
        if(num1!=0&&num2!=0)
        {
           switch (ch) {
            case '+':  System.out.println("your answer="+(num1+num2));
                break;
                 case '-':System.out.println("your answer="+(num1-num2));
                
                break;
                 case '*':System.out.println("your answer="+(num1*num2));
                
                break;
                 case '/':
                           if(num2>num1)
                    System.out.println("your answer="+(num1/num2));
                
                break;
                 case '%':System.out.println("your answer="+(num1%num2));
                
                break;
                 
           
            default: System.out.println("your character is invalid");
                break;

           }
        }
    }

    // for 'x' leads to bitwise operator....
    else if(first=='x')
    {
        System.out.println("enter the bitwise operator character:");
        char ch= sc.next().trim().charAt(0);
        System.out.println("enter the first number :");
        int num1= sc.nextInt();
        System.out.println("enter thr second number:");
        int num2= sc.nextInt();

        switch (ch) {
            case '&':System.out.println("your answer="+(num1&num2));
                
                break;
       
                case '|':System.out.println("your answer="+(num1|num2));
                
                break;
            default:System.out.println("invalid bitwise operator....");
                break;
        }
    }

//for 'b' its leads to logarthmic operation....

else if(first=='b')
{
      
System.out.println("enter the number :");
double num= sc.nextDouble();

double result=Math.log(num);
System.out.println("your answer="+result);


}
//if you press 'f' its leads to find smallest of 3 numbers..

else if(first=='f')
{
System.out.println("enter the first number :");
        int num1= sc.nextInt();
        System.out.println("enter thr second number:");
        int num2= sc.nextInt();
        System.out.println("enter the third number :");
        int num3= sc.nextInt();
       int max=num1;
       if(num2>max)
       {
        max=num2;
       }
       else if(num3>max)
       {
        max=num3;
       }
       System.out.println("your answer="+ max);

       



}

//for smallest number finding/...

    else if(first=='e')
{
System.out.println("enter the first number :");
        int num1= sc.nextInt();
        System.out.println("enter thr second number:");
        int num2= sc.nextInt();
        System.out.println("enter the third number :");
        int num3= sc.nextInt();
       int min=num1;
       if(num2<min)
       {
        min=num2;
       }
       else if(num3<min)
       {
        min=num3;
       }
       System.out.println("your answer="+ min);

       



}
// for given number is amstrong or not...

if(first=='y')
{
    System.out.println("enter the number :");
    int num= sc.nextInt();
    int ref= num;

    int answer=0;
    while(ref>0)
    {
        int rem = ref %10;
         answer=  answer*10+rem;
         ref= ref/10;
    }
    if(answer==num)
    {
        System.out.println("yes!.. this is amstrong number.. "+answer);

    }
    else
    {
        System.out.println("no its not");
    }


}
else if(first=='z')
{
 System.out.println("enter the number :");
    int num= sc.nextInt();
    int ans=0;
    while(num>0)
      
    {
        int temp=num%10;
     ans= ans*10+temp;
     num=num/10;
    }
    System.out.println("your answer="+ans);



}


    
    
}
}