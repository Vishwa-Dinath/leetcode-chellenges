package com.leetcode.dvd;

public class AddBinary {
    public static void main(String[] args) {
        String a = "0";
        String b = "0";

        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        int length = (a.length()>b.length())?a.length():b.length();

        if (a.length()<length){
            while (a.length()<length){
                a = "0"+ a;
            }
        }
        if (b.length()<length){
            while (b.length()<length){
                b = "0"+ b;
            }
        }
        String result = "";
        int excess = 0;
        for (int i = length-1; i>=0; i--) {
            int bit1 = Integer.parseInt(a.substring(i, i + 1));
            int bit2 = Integer.parseInt(b.substring(i, i + 1));

            int sum = bit1 + bit2 + excess;
            if (sum==0){
                result = "0" + result;
                excess = 0;
            } else if (sum==1) {
                result = "1" + result;
                excess = 0;
            } else if (sum==2) {
                result = "0" + result;
                excess = 1;
            }else {
                result = "1" + result;
                excess = 1;
            }
        }
        if (excess==1)result = excess + result;


        return result;
    }
}
