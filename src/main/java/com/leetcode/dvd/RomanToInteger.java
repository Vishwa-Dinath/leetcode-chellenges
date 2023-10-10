package com.leetcode.dvd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.print("Enter the roman number:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(romanToInt(input));
    }

    public static int romanToInt(String s) {
        ArrayList<String> special = new ArrayList<>();
        special.add("IV");
        special.add("IX");
        special.add("XL");
        special.add("XC");
        special.add("CD");
        special.add("CM");

        int[] specialValues = {4,9,40,90,400,900};

        int number = 0;
        String rest = "";
        for (int j = 0; j < s.length()-1; j++) {
            String pair = s.substring(j,j+2);
            if (special.contains(pair)){
                number += specialValues[special.indexOf(pair)];
                j++;
            }else{
                if (j==s.length()-2){
                    rest += pair.substring(0,2);
                }else{
                    rest += pair.substring(0,1);
                }
            }
        }
        System.out.println(rest);
        for (int i = 0; i < rest.length(); i++) {

            String temp = rest.substring(i, i + 1);

            switch (temp){
                case "I":
                    number += 1;
                    break;
                case "V":
                    number += 5;
                    break;
                case "X":
                    number += 10;
                    break;
                case "L":
                    number += 50;
                    break;
                case "C":
                    number += 100;
                    break;
                case "D":
                    number += 500;
                    break;
                case "M":
                    number += 1000;
                    break;
            }
        }
        return number;
    }
}
