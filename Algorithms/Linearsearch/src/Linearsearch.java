/**
 * Created with IntelliJ IDEA.
 * User: nishant
 * Date: 5/8/14
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;
import java.util.LinkedList;


public class Linearsearch
{
    public static void  main (String[] ag )
    {
        int array[]={3,1,9,8,9,0,2,10};  // Array initialization;
        Scanner s= new Scanner(System.in) ;
        int count=0 , i;
        LinkedList l = new LinkedList();

        System.out.println(" Enter number to be searched:");
        int a= s.nextInt();

        for(i=0;i<8;++i)
        {
            if (array[i]== a)
            {
                l.add(i+1);
                ++count;
            }

        }
        if (count==0)
            System.out.println("Element is not present in the array!!");
        else
        {
            System.out.println("Number of times number is present:"+count);
            System.out.print("Number is present at following location:"+l);
        }
    }
}
