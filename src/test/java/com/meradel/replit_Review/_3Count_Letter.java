package com.meradel.replit_Review;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _3Count_Letter {



    public static void main(String[] args) {

        String letters = "aabbcceea"; // ==> 2a2b2c2e1a


        System.out.println( countLetter(letters));
        countLetter2(letters);

        String[] names = {"miradel","mijit","miradel","alim","sattar","mijit","dilxat"};
        countName(names);
        System.out.println( countCharacteer("aabbbbcdlllpop"));

      String name = "mira7del12 323mijiy";


       String[] abc = name.split("[0-9]");
        System.out.println(Arrays.toString(abc));
        String ll ="";
        for(String kk : abc){
            ll += kk;
        }

        System.out.println(ll);

        String name2 = "mi5435ra7del12*()323mijiy";
        char[] name22 = name2.toCharArray();
        String allAlphabet = "";
        for(char letter : name22){
            if(Character.isAlphabetic(letter))
                allAlphabet+= ""+letter;

        }

        System.out.println(allAlphabet);

    }

    public static Map<Character, Integer> countLetter(String word){

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++){

            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            }else{
                map.put(word.charAt(i), map.get(word.charAt(i))+1 );
            }
        }
         return map;

    }

    public static void countLetter2(String word){

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++){

            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            }else{
                map.put(word.charAt(i), map.get(word.charAt(i))+1 );
            }
        }
        System.out.println(map);;
    }

    public static void countName(String[] names){

        Map<String,Integer> map = new HashMap<>();
        for(String name: names){
            if(!map.containsKey(name)){
                map.put(name,1);
            }else
                map.put(name, map.get(name)+1 );
        }

        System.out.println(map);
    }


    public static Map<Character, Integer> countCharacteer (String word){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < word.length(); i++){
            if(!map.containsKey(word.charAt(i)))
                map.put(word.charAt(i),1);
            else
                map.put(word.charAt(i),map.get(word.charAt(i)) +1);

        }

        return map;
    }
}
