/**
 * Created with IntelliJ IDEA.
 * User: nishant
 * Date: 6/8/14
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */

public class Insertsort
{

    public static void main (String[] args)
    {
        int array[]={230,12,45,90,23,34,67,1230}  ;
        int n=array.length,temp;
        for( int i=1;i<n;++i)
        {   for (int j=i;((j>0)&&(array[j]<array[j-1]));j--)
            {   temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp ;
            }
        }
        for(int i=0;i<n;++i)
        System.out.print(array[i]+" ");

    }
}
