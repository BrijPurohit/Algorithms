/**
 * Created with IntelliJ IDEA.
 * User: Nishant
 * Date: 12/8/14
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.*;
import java.util.Scanner;
public class Selectionsort
{
    public static void sorting( int arr[], int size)
    {
        int minimum;
        for(int i=0;i<size;++i)
        {
            for (int j = i + 1; j < size; ++j) {
                minimum = arr[i];
                if (minimum > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
    }
    public static void main (String[] args)
    {
        int array[]={101,99,67,90,123,567,234}  ;
        int n= array.length;
        sorting(array,n);     // for calling the sorting function created above.
        for(int i=0;i<n;++i)
        System.out.print(array[i]+" ")   ;
    }

}