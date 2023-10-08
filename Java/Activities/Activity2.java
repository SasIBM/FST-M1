package activities;

import java.util.*;

public class Activity2
{
    public static void main(String[] args)
    {
        int[] num = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(num));
        int searchNumber = 10;
        int fixedSum = 30;
        System.out.println("Result: " + result(num, searchNumber, fixedSum));
    }
    public static boolean result(int[] numbers, int searchNumber, int fixedSum) {
        int tempSum = 0;
        for (int number : numbers) {
            if (number == searchNumber) {
                tempSum = tempSum + searchNumber;
            }
            if (tempSum > fixedSum) {
                break;
            }
        }
        return tempSum == fixedSum;
    }
}
