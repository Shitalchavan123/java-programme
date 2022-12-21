class loops
{
    public static void main(String arg[])
    {
        int arr[]={10,20,30,40};
        int icnt=0;

        System.out.println("Traversal of Array using for loop:");
        for(icnt=0;icnt<arr.length;icnt++)  //same in c,c++ and java
        {
            System.out.println(arr[icnt]);
        }    
         System.out.println("Traversal of Array using while loop:");
         icnt=0;
         while(icnt<arr.length)   //same in c,c++ and java
         {
            System.out.println(arr[icnt]);
            icnt++;
         }
          System.out.println("Traversal of Array using do while loop:");
         icnt=0;
         do   //same in c,c++ and java
         {
            System.out.println(arr[icnt]);
            icnt++;
         }while(icnt<arr.length)
         System.out.println("Traversal of Array using for each loop:");
         for(int ino:arr)
         {
            System.out.println(ino);
         }
        }
}