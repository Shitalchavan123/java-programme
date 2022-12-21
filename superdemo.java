class base
{
  public int A,B;
  public base(int no1,int no2)
  {
   this.A=no1;
   this.B=no2;
  }
  public void fun()
  {
    System.out.println("Inside Base fun");
    System.out.println("Value of A from fun method is:"+this.A);

  }
}
class derived extends base
{
   public int x,y;
   public derived(int i,int j,int k,int l)
   {
    super(k,l);            //usecase 1
    this.x=i;
    this.y=j;
   }
public void gun()
{
    System.out.println("Value from gun method is:"+super.A);    //usecase 2
    super.fun();                                               //usecase 3
}
}

class superdemo
{
    public static void main(String arg[])
    {
       derived obj=new derived(10,20,30,40);
       obj.gun();
    }
}