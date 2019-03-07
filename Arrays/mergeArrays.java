package Arrays;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[]args)
    {

        int[] a1 = {12, 34, 56};
        int[] a2 = {7, 8, 9, 10};

        int[] a3 = merge(a1, a2);

        System.out.print(Arrays.toString(a3));

    }
    public static int[]merge(int []a,int []b)
    {
        int n = a.length + b.length;
        int [] mbush = new int[n];
        for(int i =0;i<a.length;i++)
        {
            mbush[i] = a[i];
        }
        for(int i =a.length;i<n;i++)
        {
            mbush[i] = b[i-a.length];
        }
        return mbush;
    }
}
