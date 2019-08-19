package com.meradel.replit_Review;

public class _1Int_Palindrome {

    public static boolean isPalnidromNum(int num){ // 1331
        int r , sum = 0;  int temperary = num;

        while(num > 0){
            r = num % 10;
            sum = (sum * 10) + r;
            num = num /10;

        }

        if(temperary == sum) {
            return true;
        } else {
        return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalnidromNum(-122));
        System.out.println(isPalnidromNum2(123));
        System.out.println(isPalnidromNum4(1221));
    }


    public static boolean isPalnidromNum2(int num){

        int r , sum = 0; int tem = num;

        while(num > 0){
            r = num % 10;
            sum = (sum * 10) + r;
            num = num /10;
        }

        if(sum == tem)
            return true;

        return false;
    }

    public static boolean isPalindromeNumber(int num){ //121
        int r , sum = 0; int temp = num;

        while (num > 0){

            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if(sum==temp)
            return true;
        else
        return false;
    }

    public static boolean isPalnidromNum4(int num){
        int r, sum = 0 ; int temp = num;
        while(num>0){
            r = num % 10;
            sum = ( sum * 10 ) + r;
            num = num / 10;
        }
        if(sum==temp)
            return true;
        return false;
    }


}
