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

class hashcodedemo1
{
    public static void main(String a[])
    {
      demo obj=new demo(11,21);
      System.out.println("Hashcode of object is:"+obj.hashCode());
    }
}