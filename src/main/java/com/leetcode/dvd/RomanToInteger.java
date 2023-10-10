package com.leetcode.dvd;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.print("Enter the roman number:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(romanToInt(input));
    }

    public static int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length()-1; j++) {
                String pair = s.substring(j,j+2);
            }

            String temp = s.substring(i, i + 1);

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
                case "1000":
                    number += 1000;
                    break;
            }
        }
        return number;
    }
}
