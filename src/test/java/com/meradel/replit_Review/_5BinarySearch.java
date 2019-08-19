package com.meradel.replit_Review;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class _5BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7,9,19};
        int target = 4;

        System.out.println( Arrays.binarySearch(nums,target));

        int left = 0; int right = nums.length-1;

        while(left <= right){
          int  mid = (left+right)/2;
            if(nums[mid]==target){
                System.out.println("Index of the target number is "+ mid);
                break;
            }else if(nums[mid] > target){
                right = mid -1;
            }else if(nums[mid] < target){
                left = mid +1 ;
            }
        }

        if(left > right) System.out.println("Value is not in the Array");

        System.out.println(indextOfTargetNumber(nums,2));
        System.out.println(indefOfArray2(99,nums));

    }

    public static int indextOfTargetNumber(int[] arr,int target){

        int left = 0; int right = arr.length-1;
        int mid = 0;
        while (left <= right){
             mid = (left + right)/2;

            if(target == arr[mid]) {
                return mid;
            } else if(target < arr[mid]){
                right = mid -1;
            }else if(target > arr[mid]){
                left = mid +1;
            }
        }

        if(left > right) System.out.println("Target is not in the arr");

        return mid;
    }

    public static int indefOfArray2(int target, int[] arr){ // {2.5.6.7.8.9.14}

        int left = 0 ; int right = arr.length-1; int middle = 0;

        while(left <= right){
            middle = (left+right)/2;

            if(arr[middle] == target)
                return middle;
            else if(arr[middle] > target){
                right = middle-1;
            }
            else if(arr[middle] < target){
                left = middle+1;
            }
        }

        if(left>right) System.out.println("There is no such number in array");
        return middle;
    }
}
