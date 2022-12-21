class demo
{
    public int no1;
    public int no2;

    demo(int A,int B)
    {
        no1=A;
        no2=B;
    }
}

class equalsdemo
{
    public static void main(String a[])
    {
      String s1="Hello";
      String s2="Hello";

      

      if(s1.equals(s2))
      {
        System.out.println("Object are same");
      }
      else
      {
         System.out.println("Object are different");
      }
    }
}