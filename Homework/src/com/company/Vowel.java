package com.company;

import java.util.Scanner;

public class Vowel {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter words or sentence: ");
        String str;
        str = in.nextLine();
        System.out.println("Numbers of vowels in string: " + count_vowels(str));

    }

    private static int count_vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'a' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

}
