package coreJava;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergSort{
	
    public static void main(String[] args) {
    	
    	 Scanner sc = new Scanner(System.in);
    	 
    	 int n = sc.nextInt();
    	 
    	 int arr[] = ranArr(n);
    	 System.out.println("randomly picked elements are :");
    	 for(int i=0;i<arr.length;i++) {
    		 System.out.print(arr[i]);
    	 }
    	 
    	 MergSort ob = new MergSort();

    	    // call the method mergeSort()
    	    // pass argument: array, first index and last index
    	    Instant start = Instant.now();
    	    ob.mergeSort(arr, 0, arr.length - 1);
    	    Instant end = Instant.now();
            
    	    Duration timeElapsed = Duration.between(start, end); 

    	    System.out.println("Sorted Array:");
    	    System.out.println(Arrays.toString(arr));
    	    System.out.println("The computation time for merge sort is :"+timeElapsed);
    	    
    	 }
    	 
    	 
    	 
    
    
    //random array creation//
    public static int[] ranArr(int n){
		 
		 
		int min_val = 1;
		int max_val = 10000;
		
		int arr1 [] = new int[n];

		Random random = new Random();
		int i;
		
		for(i=0; i< arr1.length ;i++) {
		

		arr1[i] = random.nextInt(max_val + min_val) + min_val;
		
		
		
		} 
		return arr1;
		
		
		
    }
    
    
     void mergeSort(int array[], int left, int right) {
        if (left < right) {

          // m is the point where the array is divided into two sub arrays
          int mid_val = (left + right) / 2;

          // recursive call to each sub arrays
          mergeSort(array, left, mid_val);
          mergeSort(array, mid_val + 1, right);

          // Merge the sorted sub arrays
          mergeoperation(array, left, mid_val, right);
        }
      }
    
    
    void mergeoperation(int array[], int p, int q, int r) {
    	
    	// some time passes
    	

        int num1 = q - p + 1;
        int num2 = r - q;

        int ar1[] = new int[num1];
        int ar2[] = new int[num2];

        // fill the left and right array
        for (int i = 0; i < num1; i++)
          ar1[i] = array[p + i];
        for (int j = 0; j < num2; j++)
          ar2[j] = array[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        
        while (i < num1 && j < num2) {
            if (ar1[i] <= ar2[j]) {
              array[k] = ar1[i];
              i++;
            } else {
              array[k] = ar2[j];
              j++;
            }
            k++;
          }

          // When we run out of elements in either L or M,
          // pick up the remaining elements and put in A[p..r]
          while (i < num1) {
            array[k] = ar1[i];
            i++;
            k++;
          }
          

          while (j < num2) {
            array[k] = ar2[j];
            j++;
            k++;
          }
                
        }
    
}