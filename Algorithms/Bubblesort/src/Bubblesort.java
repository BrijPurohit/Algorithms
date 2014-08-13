/**
 * Created with IntelliJ IDEA.
 * User: Nishant
 * Date: 13/8/14
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
//import java.util.Scanner;
public class Bubblesort
{
    public static void main(String[] args)
    {
           int array[]={3,12,45,23,56,9,34};
           for (int i= array.length-1; i>1;--i)
           {
            for (int j=0;j<i;++j)
            {
              if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }

        for(int i=0;i<array.length;++i)
        System.out.println(array[i]+" ");

    }
}
