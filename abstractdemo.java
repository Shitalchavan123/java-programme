
// abstract class is a class which contains 0 or more abstract method in it
abstract class arithmatic 
{
    public int addition(int no1,int no2)
    {
        return no1+no2;
    }
    public abstract int sub(int no1, int no2);
}
class marvellous extends arithmatic
{
   public int sub(int no1,int no2)
   {
          return no1-no2;
   }
}
class abstractdemo
{
    public static void main(String arg[])
    {
       
       marvellous mobj=new marvellous();
       int ret=0;
       ret=mobj.addition(11,20);
       System.out.println("Addition="+ret);
       ret=mobj.sub(21,10);
       System.out.println("substraction="+ret);

    }
}