class multi
{
    public static void main(String arg[])
    {
        //arr is 2 dimensional which contains 3 one dimensional array 
        //each one dimensional array contains 4 elements ,
        //each element is of type integer
        //Allowed in c,c++
        //int arr[3][4]={{10,20,30,77},{30,40,50,90},{90,80,70,88}};

       //Allowed only in java 
        int arr[][]={{10,20,30,77},{30,40,50,90},{90,80,70,88}};

       System.out.println(arr.length);              //3
        System.out.println(arr[0].length);          //4


    }
}