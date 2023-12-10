package arrayMasteringExercises.manipulation;

import org.testng.annotations.Test;

public class AverageOfArrayElements {

    public float average(int arr[])
    {
        float average = 0;
        int sum = 0;
        int length = arr.length;

        for(int i=0; i<length; i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);

        average = (sum / length);

        return average;
    }

    @Test (priority = 1)
    public void executeTest()
    {
        int arr[] = new int[]
                {1, 34, 56, 90, 87, 34, 0, 100};

        AverageOfArrayElements object = new AverageOfArrayElements();
        float avgToPrint = object.average(arr);
        System.out.println("The average of all elements : " +avgToPrint);
    }
}
