package MergeSortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in num1[]: ");  
        int m = scanner.nextInt();

        System.out.print("Enter the number of elements in num2[]: ");  
        int n = scanner.nextInt();

        int[] nums1 = new int[m + n]; //accommodate both arrays
        int[] nums2 = new int[n];

        System.out.println("Enter the elements of num1: ");  
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the elements of num2: ");  
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }
        MergeSortedArray merger = new MergeSortedArray(); //call merge method
        merger.merge(nums1, m, nums2, n);

        System.out.println("Finished merged and sorted array:");
        for (int num : nums1) {
            System.out.println(num + " ");
        }
    }
    //iterate through the arrays from the end and place the larger element in the end of nums1
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    

    //Traverse through nums2 and append its elements to the end of nums1 starting from index m.
    for (int j = 0, i = m; j < n; j++) {
        nums1[i] = nums2[j];
        i++;
    }
    Arrays.sort(nums1);  //sort merged array



    }
}
