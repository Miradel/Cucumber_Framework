package com.meradel.replit_Review;

public class csdc {


    public static int removeEl(int[] nums, int val){

        int count = 0;
        for(int i =0; i<nums.length ;i++ ){

            if(nums[i]!=val){
                count++;
            }
        }
        return count;
    }

}
