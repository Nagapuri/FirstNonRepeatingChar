package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String randomStr = "sddddfsdcdcysyppqfq";
        firstNonRepeatingChar(randomStr);
    /*    Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < randomStr.length(); i++) {
            char ch = randomStr.charAt(i);
            if (set.add(ch)) {
                myMap.put(ch, 1);
            } else {
                myMap.put(ch, myMap.get(ch) + 1);
            }
        }
        for (Map.Entry entry : myMap.entrySet()) {
            //    System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times");
        }*/
    }

    public static void firstNonRepeatingChar(String str) {
        int count=0, firstNonReptChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                System.out.println("in loop " + i);
                continue;
            }
            count = 1;
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count = count + 1;
                    //   System.out.println(str);
                    str = new String(str.replace(str.charAt(k), '0'));
                    System.out.println("After replacement " + str);
                    break;
                }
            }
            if (count == 1) {
                System.out.println("the first non repeating character is " + str.charAt(i) + " at position " + i);
                break;
            }
        }
        if (count == 0) {
            System.out.println("There is no character that is Non repeating");
        }
    }
}