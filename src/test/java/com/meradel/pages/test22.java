package com.meradel.pages;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test22 {

    public static void main(String[] args) {
        /*
        Example:
           ABCDEF
          ABC DEF
         AD BE CF
          ADBECF
         */
        Character[] arr = {'a','b','c','d','e','f'};
        List<Character> ls1 = new ArrayList<Character>();
        List<Character> ls2 = new ArrayList<Character>();
        for(int i = 0; i< arr.length; i++){
            if(i<arr.length/2)
            ls1.add(arr[i]);
            else
                ls2.add(arr[i]);
        }
        List<Character> ls3 = new ArrayList<Character>();
        for(int k = 0 ; k < ls1.size(); k++){
            ls3.add(ls1.get(k));
            ls3.add(ls2.get(k));
        }
        System.out.println(ls3);
    }


}
