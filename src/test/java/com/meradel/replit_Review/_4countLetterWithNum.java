package com.meradel.replit_Review;

import org.apache.xmlbeans.impl.regex.Match;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class _4countLetterWithNum {
    public static void main(String[] args) {
//        String name = "AAKLBCCC"; // ==> 3A2B3C1D
//                    //ABCC
//
//        String temp = "";
//        int count = 1;
//
//        for(int i = 0 ; i < name.length()-1; i++){
//
//            if(name.charAt(i)==name.charAt(i+1)){
//
//                count++;
//               // continue;
//
//            }else{
//                temp+=""+count+name.charAt(i);
//                count = 1;
//            }
//        }
//
//         temp += count+""+ name.charAt(name.length()-1);
//
//        System.out.println(temp);

        System.out.println(count2("AAABBCCDDDEF"));




    }

    public static String count(String letter){// AABBCC
        int count = 1; String temp = "";
       for(int i = 0 ; i < letter.length()-1; i++){

           if(letter.charAt(i)==letter.charAt(i+1)){
              count++;
           }else{
               temp += letter.charAt(i)+""+count;
               count=1;
           }
       }

        temp += letter.charAt(letter.length()-1)+""+count;

        return temp;

    }

    public static String count2(String letter){        /// AAABBCCDDDE ==> 3A2B2C3D1D

        String temp = ""; int count = 1;
        for(int i = 0; i < letter.length()-1; i++){

            if(letter.charAt(i)==letter.charAt(i+1)){
               count++;
            }else{
                temp +=count+""+letter.charAt(i);
                count = 1;
            }
        }
        temp += count+""+letter.charAt(letter.length()-1);

        return temp;
    }
}
