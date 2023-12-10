package copy;

import java.util.Arrays;

public class CopyAnArrayByIterating {


    public static void main(String args[])
    {
        int arr[] = new int[]
                {23, 45, 89, 34, 1, 0, 99, 87};

        int new_array[] = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            new_array[i] = arr[i];
        }

        System.out.println("Original Array : "
        + Arrays.toString(arr));

        System.out.println("New Array : "
        + Arrays.toString(new_array));
    }
}
