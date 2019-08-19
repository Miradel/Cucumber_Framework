package com.meradel.replit_Review;

public class findMaxValuesIndexFromArray {

    public static void main(String[] args) {
        int[] nums = {1,2,-3,1,2};
        int hold = Integer.MIN_VALUE;
        int currentIndex = -1;
        int i ;

        for( i = 0; i < nums.length; i++){
            if(hold < nums[i] ){
                hold = nums[i];
                currentIndex = i;
            }
        }

        System.out.println(currentIndex);
    }
}
