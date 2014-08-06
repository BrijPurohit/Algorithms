import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created with IntelliJ IDEA.
 * User: nishant
 * Date: 6/8/14
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;

public class Binarysearch
{
    public static void main (String args[])
    {
        int array[]={2,4,8,8,23,30,31,42,56,59} ;
        int start=0 ,end=array.length,mid,count=0;
        Scanner s= new Scanner(System.in)  ;
        System.out.println(" Enter the number to be searched in the array:");
        int a= s.nextInt();
       while(start<end)
        {
            mid=(start+end)/2;

            if (array[mid] == a)
            {
             System.out.println(" Element is found at location:"+(mid+1));
                break;
            }
            else if (array[mid] > a)
            end = mid - 1;
            else if (array[mid] < a)
            start = mid + 1;
        }

    }
}
