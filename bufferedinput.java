import java.io.*;

class bufferedinput
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj=new InputStreamReader(System.in);
        BufferedReader bobj=new BufferedReader(iobj);
        String name=null;
        Float marks=0.0f;
        int age=0;
        try
        {
        System.out.println("Enter your name:");
        name=bobj.readLine();

        System.out.println("Enter your age : ");
        age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your marks : ");
         marks = Float.parseFloat(bobj.readLine());

        }
        catch(IOException obj)
        {}

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks :"+marks);
        
}
}