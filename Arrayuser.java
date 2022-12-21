import java.util.Scanner;

class Arrayuser
{
    public static void main(String arg[])
    {
        int icnt=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter teh size of array:");
        int isize=sobj.nextInt();

         int Arr[]=new int[isize];

        System.out.println("Number of elements in the array are:"+Arr.length);

        System.out.println("Enter the Elements of Arary");

        for(icnt=0;icnt<Arr.length;icnt++)
        {
          Arr[icnt]=sobj.nextInt();
        }

        System.out.println("Enter the Elements of Arary");
        for(icnt=0;icnt<Arr.length;icnt++)
        {
          System.out.println(Arr[icnt]);
        }
        
        for(icnt=0;icnt<isize;icnt++)
        {
            isum=isum+Arr[icnt];
        }
       System.out.println("Addition of Arary:"+isum);


        
        
    }
}