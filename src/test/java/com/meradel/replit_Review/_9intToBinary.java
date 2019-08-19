package com.meradel.replit_Review;

import java.util.*;

public class _9intToBinary {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();


        int num = 13; int rem =0 , t=0 , s = 0;

        while (num > 0){

            sb.append(num%2);
            rem = num%2;
            num = num /2;

            if(rem ==1){
                s++;
                if(s >= t)
                    t=s;

            }else{
                s=0;
            }

        }


        System.out.println(sb);
        System.out.println(t);

        int[] arr = {111,4,5,7,22,-2};
        int temp = Integer.MIN_VALUE;
        int trackIndex = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > temp){
                temp = arr[i];
                trackIndex = i;
            }
        }

        System.out.println(temp);
        System.out.println(trackIndex);

        System.out.println(countCotinueOne2(27));

        Map<String,Integer> map = new HashMap();
        map.put("sam",123); map.put("mike",234);

           Set<String> stringSet  = map.keySet() ;




      //  map.get("sam");
        System.out.println(map.keySet().contains("sammike"));

    }

    static int countCotinueOne(int num){
        int rem = 0;
        int count =0;
        int conseqetive = 0;

        while(num > 0){
            rem = num % 2;
            num = num /2;

            if(rem==1){
               count++;

               if(count >= conseqetive)
                   conseqetive = count;

            }else{
                count=0;
            }
        }

        return conseqetive;
    }

    static int countCotinueOne2(int num){
        List<Integer> ls = new ArrayList<>();
        int rem = 0;
        int count = 1;

        while(num > 0){
          ls.add(num%2);
          num = num/2;
        }

        // 1 1 0 1 1 ==> 2

        for(int i = 0; i<ls.size()-1 ;i++){
            if(ls.get(i)==ls.get(i+1) && ls.get(i)==1){
                count++;
            }else{
                count = 1;
            }

        }

        return count;
    }
}
