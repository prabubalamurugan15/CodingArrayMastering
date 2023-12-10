package print;

import org.testng.annotations.Test;

import java.util.Arrays;

public class PrintAllZerosIn2DArray {

    @Test (priority = 5)
    public void printAllZeros()
    {
        int arr[][] = new int[10][10];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                arr[i][j] = 0;
                System.out.printf("%2d", arr[i][j]);
            }

            System.out.println();
        }
    }
}
