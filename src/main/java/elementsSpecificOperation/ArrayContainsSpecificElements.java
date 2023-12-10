package elementsSpecificOperation;

import org.testng.annotations.Test;

public class ArrayContainsSpecificElements {

    public boolean checkSpecificElement(int arr[], int ele)
    {
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] == ele)
            {
                return true;
            }
        }
        return false;
    }

    @Test (priority = 0)
    public void executeTest()
    {
        int arr[] = new int[]
                {30, 45, 67, 12, 0, 1, 100};

        int checkElement = 67;

        ArrayContainsSpecificElements object =
                new ArrayContainsSpecificElements();
        boolean status = object.checkSpecificElement(arr,checkElement);
        if(status == true)
        {
            System.out.println("The given element is present in array");
        }else
        {
            System.out.println("The given element is not present in array");
        }

    }
}
