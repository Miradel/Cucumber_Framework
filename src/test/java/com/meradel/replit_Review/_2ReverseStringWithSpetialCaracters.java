package com.meradel.replit_Review;

public class _2ReverseStringWithSpetialCaracters {


    /*

    Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
    reverse the string in a way that special characters are not affected.

    Input:   str = "a,b$c"
    Output:  str = "c,b$a"
    Note that $ and , are not moved anywhere.
    Only subsequence "abc" is reversed.
     */

    public static void main(String[] args) {
        System.out.println(reverse("Ab,c,de!$"));

        System.out.println(reverse2("ABC_D_*Q"));
        System.out.println(reverse3("a,b$c"));
    }

    public static String reverse(String word){
        char[] arr = word.toCharArray();
        int r = arr.length-1;  int lf = 0;
        while (lf < r){
            if(!Character.isAlphabetic(arr[lf]))
                lf++;
            else if (!Character.isAlphabetic(arr[r]))
                r--;
            else{
                char temt = arr[lf];
                arr[lf] = arr[r];
                arr[r] = temt;
                lf++;
                r--;
            }
        }

        String rev="";

        for(char a : arr){
            rev+=""+a;
        }
        return rev;
    }

    public static String reverse2(String letter){  // "a,b$c"
        char[] arr = letter.toCharArray();

       int left = 0 ;  int right = arr.length-1;

       while(left < right){
           if(!Character.isAlphabetic(arr[left]))
               left++;
           else if(!Character.isAlphabetic(arr[right]))
               right--;
           else{
               char tempt = arr[left];
               arr[left] = arr[right];
               arr[right]= tempt;
               left++;
               right--;
           }
       }

       String empt = "";

       for(char a : arr){
           empt+=""+a;
       }
        return empt;
    }

    public static String reverse3(String word){ // str = "a,b$c"
        char[] arr = word.toCharArray();
        int left = 0; int right = arr.length-1;
        while (left < right){
            if(!Character.isAlphabetic(arr[left]))
                left++;
            else if(!Character.isAlphabetic(arr[right]))
                right--;
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String hold = "";
        for(char a : arr ){
            hold+=""+a;
        }

        return hold;
    }


    public static String reverse4(String word){ //  Ab,c,de!$

        char[] arr = word.toCharArray();
        String temp = ""; int left = 0; int right = arr.length-1;

        while (left<right){
            if(!Character.isAlphabetic(arr[left])){
                left++;
            }else if(!Character.isAlphabetic(arr[right])){
                right--;
            }else{
                char tem = arr[left];
                arr[left] = arr[right];
                arr[right] = tem;
            }
        }

        for(char a : arr){
            temp+=""+a;
        }

        return temp;
    }
}
