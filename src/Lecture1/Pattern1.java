package Lecture1;

import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i++<=num)
        {
            int j=1;
            while(j++<i)
            {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
