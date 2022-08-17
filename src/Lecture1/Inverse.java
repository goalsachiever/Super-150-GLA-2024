package Lecture1;
import java.util.Scanner;

//Take the following as input.
//        A number
//        Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.
//
//        Write a function that returns its inverse, where inverse is defined as follows
//
//        Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
//
//        Print the value returned.


public class Inverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res =0;
        int i = 1;
        while(num !=0)
        {
            int temp = (num %10 ) -1;
            res = res + i* (int)Math.pow(10,temp);
            num /= 10;
            i++;
        }
        System.out.print(res);
    }
}
