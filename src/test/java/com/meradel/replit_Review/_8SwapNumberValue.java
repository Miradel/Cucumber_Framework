package com.meradel.replit_Review;

import java.util.Arrays;

public class _8SwapNumberValue {
    public static void main(String[] args) {



        // swap with create temp element
        int a = 10 ; int b = 20;
        int tempt = a;
        a=b;
        b=tempt;


        // Swap doing without creating Temp Element
        int c = 10; int d = 20;
        c= c+d; //==> 30
        d= c-d; //==> 10
        c= c-d; //==> 20


        int[] arr = {1,2,4};
        int[] arr2 = {2,5,9,12};
         arr=arr2;
         arr2[0] = 19;
        System.out.println(Arrays.toString(arr2));


        String s = "3.7";
       // s.contains()
       double num = Double.parseDouble(s);
        System.out.println(num);

        int nummm = 244;
       String nn= Integer.toString(nummm);
        System.out.println(nn);

        int[] arr22 = {2,3,4,6,20,1};
        int temp = Integer.MIN_VALUE;
        for(int aa: arr22){
            if(aa > temp)
                temp = aa;
        }

        System.out.println(temp);


        int[] arr222 = {2,3,4,-3,6,20,1};
        int temp2 = Integer.MAX_VALUE;
        int index = 0;
        for(int aaa: arr222){
            if(aaa < temp2){
                temp2 = aaa;
                index++;
            }
        }

        int temp3 = Integer.MAX_VALUE;
        int hold = 0;
        for(int i = 0 ; i < arr222.length; i++){
            if(arr222[i] < temp3){
                temp3 = arr222[i];
                hold = i;
            }
        }

        System.out.println(temp2);
        System.out.println(hold);

    }


}
