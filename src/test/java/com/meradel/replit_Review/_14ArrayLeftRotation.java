package com.meradel.replit_Review;

import java.lang.reflect.Array;

public class _14ArrayLeftRotation {

    public static void main(String[] args) {


      int[] arr = {1,2,3,4,5};

      //  System.out.println( rotLeft2(arr,2).toString() );


        for(int each : rotLeft2(arr,2)){

            System.out.println(each);
        }





    }




    static int[] rotLeft(int[] a, int d) {


        // 1, 2 , 3, 4 , 5
        // 3, 4,  5,  1, 2

        for(int i = 0 ; i < a.length ; i++){

            if(a.length - d >= 0) // i = 2 a[i-d] = a[i];
                // a[i] = a[d+i];
                a[i-d] = a[i];

            else
                a[i+(a.length-d)]= a[i];
            //a[a.length-d] = a[i];
        }

        return a;
    }


    static int[] rotLeft2(int[] a, int d) {


        // 1, 2 , 3, 4 , 5
        // 3, 4,  5,  1, 2

        if(d==0) return a;

        int[] arr = new int[a.length];

        for(int i = 0 ; i < a.length ; i++){

            if(i + d < a.length) // i = 2 a[i-d] = a[i];
            arr[i] = a[i+d];

            else
                arr[i] = a[(i+d)-a.length];

        }

        return arr;
    }


    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int temp,i,j;
        for(i=0;i<k;i++){
            temp=a[0];
            for(j=1;j<n;j++){
                a[j-1]=a[j];
            }
            a[n-1]=temp;
        }

        return a;
    }


}
