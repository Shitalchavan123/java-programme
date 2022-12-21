package Marvellous.PPA;           //nested package 

public class loop
{
    public void display()
    {
        int arr[]= new int[4];

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;

        System.out.println("Elements of array are:");

        for(int icnt=0; icnt<arr.length; icnt++)
        {
          System.out.println(arr[icnt]);

        }
    }
}