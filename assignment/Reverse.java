package com.assignment;

public class Reverse {
    public static void main(String[] args) {
        String str1= "Java";
        String[] arr = str1.split("");
        String  reverseStr="";
        for (int i=arr.length-1;i>=0;i--){
            reverseStr+=arr[i];
        }
        System.out.println(reverseStr);
    }
}
