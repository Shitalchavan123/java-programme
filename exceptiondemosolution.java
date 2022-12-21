import java.util.*;

class exceptiondemosolution
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        System.out.println("Enter first number");
        iNo1 = sobj.nextInt();
        System.out.println("Enter second number");
        iNo2 = sobj.nextInt();
    try
    {
       System.out.println("inside try block");
       iAns = iNo1 / iNo2;
       System.out.println("Division is : "+iAns);
     }
     catch(ArithmaticException obj)
     {
        System.out.println("inside catch1");
        System.out.println("obj");
     }
     catch(NullPointerException obj)
     {
         System.out.println("inside catch2");
          System.out.println("obj");
     }
     catch(Exception obj)
     {
         System.out.println("inside catch3");
          System.out.println("obj");
     }
     finally
     {
        System.out.println("Inside finally block");
        sobj.close();
     }
        
    }
}