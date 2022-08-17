package Lecture1;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0, second = 1, third=0;

        for(int i=0;i<n;i++)
        {
            System.out.print(first+" ");
            third = first + second;

            first = second;
            second = third;
        }
    }
}
