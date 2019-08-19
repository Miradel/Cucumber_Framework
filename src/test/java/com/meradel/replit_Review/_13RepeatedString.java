package com.meradel.replit_Review;

public class _13RepeatedString {

    public static void main(String[] args) {

        System.out.println(repeatedString("aba",1));

        System.out.println(repeatedString("a",1000));

        int[] arr = {1,2,3,4,5};

        System.out.println(rotLeft(arr,2));
    }

    static long repeatedString(String s, long n) {
        long count = 1;
        char hold = s.charAt(0);
        int r = 0; int beishu = 0;

        if(s.length()==0) {
            count = n;
        }

       else if (n <= s.length()) {
                for (int i = 1; i < n; i++) {
                    if (hold == s.charAt(i))
                        count++;
                }
            }  else {
                r = (int) n % s.length();
                beishu = (int) n / s.length();

                for (int i = 1; i < s.length(); i++) {
                    if (hold == s.charAt(i))
                        count++;
                }
                count = count * beishu;

                for (int i = 1; i <= r; i++) {
                    count++;
                    if (hold == s.charAt(i))
                        count++;
                }
            }


        return count;


    }



    static int[] rotLeft(int[] a, int d) {

        for(int i = 0 ; i < a.length ; i++){

            if(a.length - d >= 0)
                a[i] = a[d+i];

            else
                a[a.length-d+i] = a[i];
        }

        return a;
    }

}
