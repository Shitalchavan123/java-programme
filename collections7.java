import java.util.*;
class collections7
{
    public static void main(String a[])
    {
        Stack <Character>sobj=new Stack<Character>();

        sobj.push('a');
        sobj.push('m');
        sobj.push('c');
        sobj.push('v');
        sobj.push('s');

        System.out.println("Elements of stack are:"+sobj);

        System.out.println("Poped element is:"+sobj.pop());

         System.out.println("Elements of stack are:"+sobj);

    }
}