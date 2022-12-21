class Arithmatic
{
    public int division(int A,int B) throws ArithmaticException
    {
        int ans=0;
        ans=A/B;
        return ans;

    }
}
class throwsdemo
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the first number");
        int no1=sobj.NextInt();

        System.out.println("Enter the second number");
        int no2=sobj.NextInt();

        Arithmatic aobj=new Arithmatic();

        try
        {
          int ret=aobj.dividion(no1,no2)
          System.out.println("Division is:"+ret)
        }
        catch(ArithmaticException obj)
        {
           System.out.println("Exception occured");
           System.out.println(obj);
                   }

    }
}