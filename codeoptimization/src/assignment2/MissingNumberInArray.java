package assignment2;

/*Java Program to find the missing element*/
import java.util.*;
import java.util.Arrays;

//Driver Code
public class MissingNumberInArray {
  public static void main(String args[]) {

    int arr[] = { 69, 86, 90, 6, 67, 36, 47, 11, 70, 14, 27, 53, 49, 99, 93, 66, 82, 38, 28, 35, 18, 95, 55, 24, 30, 62,
        39, 92, 58, 91, 72, 40, 74, 2, 20, 33, 65, 44, 41, 56, 45, 88, 34, 22, 60, 42, 61, 75, 100, 3, 48, 96, 1, 71,
        17, 64, 84, 13, 76, 19, 15, 81, 98, 54, 80, 59, 63, 31, 12, 85, 77, 89, 7, 57, 52, 10, 94, 46, 79, 16, 23, 83,
        5, 37, 97, 51, 32, 26, 21, 29, 4, 43, 9, 68, 73, 25, 78, 50, 8, 87 };
    // {
    // 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100
    // }; // Declare array
    int n = arr.length;
    int sum = (n + 1) * (n + 2) / 2; // Calculate the expected sum of all the
                                     // elements from 1 to n
    for (int i = 0; i < n; i++) {
      sum = sum - arr[i]; // Subtract each element from the sum
    }
    System.out.println("Missing Element is " + sum); // Print the missing
                                                     // element
  }
}
