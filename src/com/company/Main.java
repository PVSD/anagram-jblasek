package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        System.out.println("Type in your first word.");
        String wordOne = kbReader.next();
        System.out.println("Type in your second word.");
        String wordTwo = kbReader.next();

        if (wordOne.length() == wordTwo.length()) {

            char[] array1 = wordOne.toCharArray();
            char[] array2 = wordTwo.toCharArray();


            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i])
                    count++;
            }

            if (count == array2.length) ;
            System.out.println("Your words are anagrams of each other!");

        }
        else {
            System.out.println("Your words are not anagrams of each other.");
            System.exit(0);
        }

        }




    }

