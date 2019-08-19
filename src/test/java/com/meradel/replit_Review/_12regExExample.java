package com.meradel.replit_Review;

public class _12regExExample {

    public static void main(String[] args) {

        String data = "Dell HP Apple Windows";
        String[] company = data.split("\\s");
        for(String each: company){
            System.out.println(each);
        }


        /*
        \\s - matches single whitespace character
        \\s+ - matches sequence of one or more whitespace characters.
         */
        String data2 = "Dell   HP    Apple    Windows";
        String[] company2 = data.split("\\s+");


        String data3 = "Dell.HP.Apple.Windows";
        String[] company3 = data.split("\\.");
        for(String each2: company3) {
            System.out.println(each2);
        }


        // Print only the number from string
        // 1. ==> \\D mean all the non number character
        // 2. ==> [^0-9] all the non numeric number,, ^ ==> non
        //3. ==> [a-zA-z0-9] all alphabetic and numeric num
        String data4 = "1Dell23 4HP* 5Apple6Windows";
        System.out.println(data4.replaceAll("\\D",""));
        System.out.println(data4.replaceAll("[a-zA-Z0-9\\s]+",""));
        System.out.println(data4.replaceAll("[^0-9]+",""));


        // Check weather string only contains numeric charactor
        String num = "12213242423";
        String reg = "[0-9]+";
        System.out.println(num.matches(reg));

        // Check weather string only contains alphabetic charactor
        String name= "scnsdcojoemsc";
        String reg2 = "[a-zA-Z]+";
        System.out.println(name.matches(reg2));











    }
}
