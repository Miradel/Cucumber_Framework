package com.meradel.replit_Review;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _10pairOfSucks {

    public static void main(String[] args) {

        int arr[] = {10,20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(countPairs(arr));
        System.out.println( countPairs2(arr));
    }

    static int countPairs(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();
        int pairs=0;
        for(int i = 0; i < arr.length; i++){
           if(!map.containsKey(arr[i]))
               map.put(arr[i],1);
           else
               map.put(arr[i],map.get(arr[i])+1);
        }

        for(int each: map.values())
            pairs+=each/2;

        return pairs;

    }

    static int countPairs2(int[] arr){

        Set<Integer> set = new HashSet<>();
        int pairs = 0;

        for(int i = 0; i < arr.length; i++){

            if(!set.contains(arr[i]))
                set.add(arr[i]);
            else{
                pairs++;
                set.remove(arr[i]);
            }

        }
        return pairs;
    }
}
