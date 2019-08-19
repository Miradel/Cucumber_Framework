package com.meradel.replit_Review;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class abc {

    public static void main(String[] args) {



        List<Integer> nums = new ArrayList<>();
        nums.add(5); nums.add(2); nums.add(3);

        List<Integer> maxes = new ArrayList<>();
        maxes.add(2); maxes.add(4);


        System.out.println( counts(nums,maxes));

        int bb =(int)Math.pow(2,9);
        System.out.println(bb);

        System.out.println(isPowerOfTwo(-10));



    }


    static List<Integer> counts(List<Integer> nums, List<Integer> maxes) {

        List<Integer> result = new ArrayList();

        for (int i = 0; i < maxes.size(); i++) {
            int hold = maxes.get(i);
            int count = 0;

            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) <= hold) {
                    count++;
                }
            }
            result.add(count);
            count = 0;
        }
        return result;
    }


    static LinkedList<String> reverse(LinkedList<String> lst){

        LinkedList<String> lst2 = new LinkedList<>();

        for(int i = lst.size()-1; i>=0; i-- ){

            lst2.add(lst.get(i));
        }

        return lst2;
    }

    static boolean isPowerOfTwo(int num){


        if(num==0)
            return false;

        while( num != 1 ){

            if(num % 2 == 1)
                return false;

            num = num/2;

        }

        return true;
    }


    static boolean isPowerOfTwo2(int num){

        while(num!=1){

            if(num%2==1)
                return false;

            num = num/2;
        }


        return true;
    }
}
