public class staticdemo
{
    static
    {
       System.out.println("Inside static blcok which contains main");
    }
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        System.out.println("value os static no3:"+demo.no3);
        System.out.println("value os static no4:"+demo.no4);
        demo.gun();

        demo obj1=new demo();
        demo obj2=new demo();

        obj1.fun();

        
    }
}
class demo
{
   public int no1;           //nonstatic charactistics
   public int no2;           //nonstatic charactistics
   public static int no3;    //static charactistics
   public static int no4;    //static charactistics

   static
   {
      System.out.println("Inside static  of demo");
      no3=20;
      no4=30;

   }
   public demo()
   {
     System.out.println("Inside Constructor");
     no1=58;
     no2=65;
   }
   public void fun()
   {
     System.out.println("Inside non sttaic method");
     System.out.println("value of  no1:"+this.no1);
        System.out.println("value of no2:"+this.no2);
        System.out.println("value of static no3:"+this.no3);
        System.out.println("value of static no4:"+this.no4);
   }
   public static void gun()
   {
     System.out.println("Inside  sttaic method");
     System.out.println("value of  no1:"+no1);
        System.out.println("value of no2:"+no2);
        System.out.println("value of static no3:"+no3);
        System.out.println("value of static no4:"+no4);
   }

}