import java.util.*;
class collections8
{
    public static void main(String a[])
    {
        Hashtable <String, Integer>hobj=new Hashtable<String, Integer>();

        hobj.put("PPA",18000);
        hobj.put("LB",18500);
        hobj.put("PYTHON",20000);

        Enumeration eobj=hobj.keys();

        while(eobj.hasMoreElements())
        {
            System.out.println("Data is:"+eobj.nextElement());

        }
      hobj.remove("LB");
        
    }
}