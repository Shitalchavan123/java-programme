import java.util.*;
import Marvellous.Arithmatic; 
import Marvellous.PPA.loop;

class demopackage
{
    public static void main(String arr[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter first Number");
       int ino1=sobj.nextInt();

       System.out.println("Enter second Number");
       int ino2=sobj.nextInt();

       Arithmatic aobj=new Arithmatic(ino1,ino2);

       int iresult=aobj.addition();
       System.out.println("Addition"+iresult);

        iresult=aobj.sub();
       System.out.println("sub"+iresult);

       loop lobj=new loop();
       lobj.display();
    }

}