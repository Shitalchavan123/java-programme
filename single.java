import java.lang.*;
class single
{
    public static void main(String arr[])
    {
       //Base bobj1=new Base();
       //Derived dobj1=new Derived();
       Base bobj2=new Derived();
      // Derived dobj2=new Base();

      bobj2.fun();
      bobj2.fun(11);
      bobj2.gun();
      //bobj2.sun();
    }
}
class Base
{
   public int A,B;
   public Base()
   {
    System.out.println("Base constructor");
    this.A=10;
    this.B=20;
   }
public void fun()
{
    System.out.println("Inside base fun");
}
public void gun()
{
    System.out.println("Inside base gun");
}
public void fun(int no)
{
    System.out.println("Inside base fun with one integer");
}
}

class Derived extends Base
{
   int x,y;
   public Derived()
   {
    System.out.println("Derived constructor");
    this.x=30;
    this.y=40;
   }   
   public void sun()
   {
    System.out.println("Inside Derived Sun");

   }
   public void gun()
   {
    System.out.println("Inside Derived gun");

   }
   }
