package arrayMasteringExercises.manipulation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SumOfAllArrayElements {

    public int findSum(int arr[])
    {
        int sum = 0;
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }

        return sum;
    }

    @Test (priority = 0)
    public void executeTest()
    {
        int arr[] = new int[]
                {10, 70, 56, 34, 99, 0, 1, 3, 99};

        SumOfAllArrayElements object = new SumOfAllArrayElements();
        int sum = object.findSum(arr);

        System.out.println("The sum of array elements are : " + sum);
    }
}
