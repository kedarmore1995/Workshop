package com.assignment;

public class EvenNum {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i=0; i<25; i++){
            if (i%2==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers between 1 to 25: "+sum);
        System.out.println("Count of even numbers between 1 to 25: "+count);
    }
}
