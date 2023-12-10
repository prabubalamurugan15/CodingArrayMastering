package arrayMasteringExercies.sorting;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortStringArray {

    public void stringArrayToSort(String arr[])
    {
        System.out.println("\n" + "Sort String Array");

        //Print original string array
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test (priority = 1)
    public void executeTest()
    {
        String arr[] = new String[]
                {"Prabu" , "Kohli", "Rohit", "Dhoni"};

        SortStringArray object = new SortStringArray();
        object.stringArrayToSort(arr);
    }
}
