package com.meradel.replit_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the ‘countStudents’ function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY height as parameter.
     */
// 4 3 2 1
    public static int countStudents(List<Integer> height) {
        if(height.size()==2){
            return 0;
        }
        // Write your code here
        List<Integer> lst = new ArrayList<>();

        for (int i = 1; i < height.size(); i++) {
            lst.add(height.get(i));
        }
        Collections.sort(lst);
        int count = 0;
        for (int i = 1; i < height.size(); i++) {
            if(height.get(i) != lst.get(i-1)){
                count++;
            }
        }
        return count;
    }

    public static int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != arr[i])
                count++;
        }

        return count;

    }
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(4); lst.add(4); lst.add(3); lst.add(2); lst.add(1);
        System.out.println(countStudents(lst));

        int[] arr = {4,4,3,2,1};
        System.out.println(heightChecker(arr));
    }

}
