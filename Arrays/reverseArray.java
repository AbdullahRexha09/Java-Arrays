package Arrays;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[]args)
    {
        int a1[] = {1,2,3,4};
        int a2[] = {1,2,3};

        int a = 4,b=6;
        swap(a1);
        System.out.print(Arrays.toString(a1));



    }
    public static void swap(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            //a[i] = a[a.length-1-i];
            int temp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = temp;

        }
    }

    }
