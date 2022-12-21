import java.util.*;

class collections1
{
    public static void main(String a[])
    {
        LinkedList <Integer>lobj=new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(101);
        lobj.add(100);

        System.out.println("Elements of linked list are:"+lobj);

        lobj.addFirst(1000);

        System.out.println("Elements of linked list are:"+lobj);

        lobj.addLast(2000);
        System.out.println("Elements of linked list are:"+lobj);

        Iterator iobj=lobj.iterator();
        System.out.println("Data using iterator is:");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        if(lobj.contains(2000))
        {
            System.out.println("2000 is present in LL");
        }
        else
        {
            System.out.println("2000 is not present in LL");
        }

        lobj.remove(1);
        System.out.println("Elements of linked list are:"+lobj);

        lobj.remove(0);
        System.out.println("Elements of linked list are:"+lobj);

         lobj.removeLast();
        System.out.println("Elements of linked list are:"+lobj);

        System.out.println("Number of elements are:"+lobj.size());

         lobj.set(1,500);
        System.out.println("Elements of linked list are:"+lobj);

        lobj.clear();
        System.out.println("Elements of linked list are:"+lobj);







    }
}