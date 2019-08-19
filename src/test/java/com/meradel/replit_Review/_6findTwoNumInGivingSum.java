package com.meradel.replit_Review;

public class _6findTwoNumInGivingSum {
    // Find two numbers in an array that add up to a given number.
    public static void main(String[] args) {


        int given = 8;
        int[] arr = {2,3,5,7,6,1};
        getTwoNum(8,arr);
    }

    public static void getTwoNum(int given, int[] arr){

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int hold = arr[i];
          //  int count = 0;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]+ hold ==given){
                    count++;
                    System.out.println("There are two number in the array: "+arr[i]+" , "+arr[j]);
                }
            }
        }

        System.out.println("There are "+ count+" pair nums");
    }
}
