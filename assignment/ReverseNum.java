package com.assignment;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 12345;
        int revNum=0;
        while (num!=0){
            int remainder = num % 10;
            revNum=revNum*10+remainder;
            num=num/10;
        }
        System.out.print(revNum);
    }
}
