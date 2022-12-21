class demo
{
    public int no1;
    public final int no2=11;
    public final int no3;

public demo()
{
    no1=0;
    no3=32;
}
}
class final1
{
    public static void main(String arg[])
    {
        final int i=50;
       demo obj=new demo();
       obj.no1++;
       //obj.no2++;
       //obj.no3++;
    }
}