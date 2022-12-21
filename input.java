import java.util.*;

//import java.util.scanner;

class Input
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0;
        int ino2=0;
        int ians=0;

        System.out.println("Enter First number");
        ino1=sobj.nextInt();

        System.out.println("Enter second number");
        ino2=sobj.nextInt();

        ians=ino1+ino2;

        System.out.println("Addition="+ians);


    }
}