package elementsSpecificOperation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class IndexOfAnArrayElement {

    public int indexOfElement(int arr[], int ele)
    {
        if(arr == null){
            return -1;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == ele)
            {
                return i;
            }
        }
        return -1;
    }

    @Test (priority = 1)
    public void executeTest()
    {
        int arr[] = new int[]
                {78, 65, 23, 10, 90, 98};
        int checkElement = 10;

        System.out.println("Original array is : \n"+Arrays.toString(arr));

        IndexOfAnArrayElement object = new IndexOfAnArrayElement();
        int indexToPrint = object.indexOfElement(arr, checkElement);
        System.out.println("The index position of given element is : " + indexToPrint);
    }
}
