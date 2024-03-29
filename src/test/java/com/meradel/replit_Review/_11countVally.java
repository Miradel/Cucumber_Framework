package com.meradel.replit_Review;

import java.util.ArrayList;
import java.util.List;

public class _11countVally {
    public static void main(String[] args) {

        System.out.println(countingValleys(8,"UUDDDUDUU"));

       String reg = "[0-9]+";

    }


    static int countingValleys(int n, String s) {
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for (char c : s.toCharArray()) {
            if (c == 'U') ++lvl;
            if (c == 'D') --lvl;

            // if we just came UP to sea level
            if (lvl == 0 && c == 'U')
                ++v;
        }
        return v;
    }
}
