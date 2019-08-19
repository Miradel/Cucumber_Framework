package com.meradel.replit_Review;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//
//        String S;
//
//
//        String ss = "";
//        String ll = "";
//
//        for (int j = 0; j < t; j++) {
//            S = scan.next();
//
//
//            for (int i = 0; i < S.length(); i++) {
//                if (i % 2 == 0)
//                    ss += "" + S.charAt(i);
//                else
//                    ll += "" + S.charAt(i);
//
//            }
//
//            System.out.println(ss + " " + ll);
//            ss = "";
//            ll = "";
//        }


        System.out.println(factorial(4));
    }

    static int factorial(int n) {
        int sum = n;
        if (n <= 1) return 1;
        else {
            for (int i = n - 1; i >= 1; i--) {
                sum = sum * i;
            }
            return sum;
        }


    }

}
