class employee implements Cloneable
{
   public int eid;
   public String name;
   public int salary;

   public employee(int no,String str,int value)
   {
    this.eid=no;
    this.name=str;
    this.salary=value;

   }
   public Object clone()throws CloneNotSupportedException
   {
      return super.clone();
   }
}
class clonedemo
{
    public static void main(String a[])
    {
      try
      {
       employee obj=new employee(10,"Shital",50000);
       employee obj2=(employee)obj.clone();

       System.out.println("Name of the first employee"+obj.name);
       System.out.println("Name of the second employee"+obj2.name);

       System.out.println("salary of the first employee"+obj.salary);
       System.out.println("salary of the second employee"+obj2.salary);

       obj.name="Mahesh";

       System.out.println("Name of the first employee"+obj.name);
       System.out.println("Name of the second employee"+obj2.name);



      }
      catch(CloneNotSupportedException obj)
      {}
    }
}