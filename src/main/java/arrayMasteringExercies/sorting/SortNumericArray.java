package arrayMasteringExercies.sorting;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortNumericArray {


    //Sorting using pre-defined methods
    public void sortNumericArray(int arr[])
    {
        System.out.println("Sort Numeric Array");

        //Print original array
        System.out.println(Arrays.toString(arr));

        //Sort given array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test (priority = 0)
    public void executeTest()
    {
        int myArray[] = new int[]
                {
                        10, 20, 30, 40, 50, 1, 2, 0, 9, 99, 98, 101
                };

        SortNumericArray object = new SortNumericArray();
        object.sortNumericArray(myArray);
    }
}
