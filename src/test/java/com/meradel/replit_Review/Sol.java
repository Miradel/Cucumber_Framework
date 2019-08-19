package com.meradel.replit_Review;

import java.util.Scanner;

public class Sol {

    public static void main(String[] args) {

       int a = 5; int b = 10;

       String ad = "fsd";  String ll = "sdfsvs";
        System.out.println( ad.compareTo(ll) > 0 ? "Yes" : "No");


       swap(a,b);


        int[] arr = {3,2,1};
        int swapCount = 0;

        for(int i = 0 ; i<arr.length ; i++){

            for(int j = 0; j < arr.length-1; j++){

                if(arr[j] > arr[j+1] ){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swapCount++;
                }
            }

        }

        System.out.println("total swap: "+ swapCount);


//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Your age ?");
//        int age = scan.nextInt();
//        System.out.println("My age is "+ age);
//
//        System.out.println("Ur name ?");
//        String name = scan.next();
//        System.out.println("MY name is "+name);

        String password = "dmsfo2134s@f";
        String regEx="[a-zA-Z0-9]+";
        System.out.println(password.matches(regEx));

        int[]arrr = {2,4,3,7,9};



    }

    static void swap(int a , int b){
        a = a+b;
        b = a-b;
        a = a-b;
    }

     static void printArray(Object[] arr){
        for(Object each : arr){
            System.out.println(each);
        }
    }
}
