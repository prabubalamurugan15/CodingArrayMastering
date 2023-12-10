package arrayMasteringExercises.manipulation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MaxAndMin {

    public void findMaxAndMin(int arr[])
    {
        int length = arr.length;
        int max =arr[0];
        int min =arr[0];

        System.out.println("The given array elements are : " + Arrays.toString(arr));

        for(int i=1; i<length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }

            if(min > arr[i])
            {
                min = arr[i];
            }

        }

        System.out.println("The maximum of given array is : " + max);
        System.out.println("The minimum of given array is : " + min);
    }

    @Test (priority = 2)
    public void executeTest()
    {
        int arr[] = new int[]
                {
                        10, 20, 1, 2, 99, 75
                };

        MaxAndMin object = new MaxAndMin();
        object.findMaxAndMin(arr);
    }
}
