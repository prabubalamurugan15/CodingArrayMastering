package insertion;

import org.testng.annotations.Test;

import java.util.Arrays;

public class InsertNumberToSpecificIndex {


    public void insertNumberToSpecificIndex(int arr[], int index, int number)
    {
        int new_array[] = new int[arr.length];
        for(int j=0; j < arr.length; j++)
        {
            new_array[j] = arr[j];
        }

        for(int i= arr.length-1; i>=index; i--)
        {
            new_array[i] = arr[i-1];
        }
        new_array[index] = number;
        System.out.println("Array after insertion : " + Arrays.toString(new_array));
    }


    @Test(priority = 0)
    public void executeTest()
    {
        int arr[] = new int[]
                {10, 20, 32, 34, 45, 89};
        int specificIndex = 2;
        int numberToInsert = 89;

        System.out.println("The original array is : " + Arrays.toString(arr));

        InsertNumberToSpecificIndex object = new InsertNumberToSpecificIndex();
        object.insertNumberToSpecificIndex(arr, specificIndex, numberToInsert);
    }
}
