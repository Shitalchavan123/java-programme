import java.util.*;

class book
{
    public String Name;
    public int price;

    public book(String s,int i)
    {
     this.Name=s;
     this.price=i;

    }
    public void display()
    {
        System.out.println("Book name:"+this.Name+"price:"+this.price);
    }
}
class collections3
{
    public static void main(String a[])
    {
       LinkedList <book>lobj=new LinkedList<book>();
    
       lobj.add(new book("Let us c",400));
       lobj.add(new book("Data Structure",500));
       lobj.add(new book("C++",545));
       lobj.add(new book("Angular",980));

       Iterator iobj=lobj.iterator();
       book bref=null;
      System.out.println("Elements of linked list are:");
       while(iobj.hasNext())
       {
        bref=(book)iobj.next();
        bref.display();
       }
       lobj.clear();
    }
}