class maths
{
    public int ino1;       //characteristics
    public int ino2;       //charactierstics

    public maths()
    {
        System.out.println("Inside Default constructor");
        ino1=0;
        ino2=0;
    }
    public maths(int a,int b)
    {
        System.out.println("Inside Parameterised constructor");
        ino1=a;
        ino2=b;
    }
    public int addition()   //behaviour
        {
            int ians=0;
            ians=ino1+ino2;
            return ians;
        }
         public int sub()    //behaviour
        {
            int ians=0;
            ians=ino1-ino2;
            return ians;
        }
    
}// End of maths class

class Demo
{
    public static void main(String arr[])
    {
     System.out.println("inside main function");

     maths mobj1=new maths();
     maths mobj2=new maths(10,11);

     iret=0;
     
     iret=mobj1.addition();
     System.out.println("Addition="+iret);

     iret=mobj2.addition();
     System.out.println("Addition="+iret);
    }
}