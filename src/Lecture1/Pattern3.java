package Lecture1;

import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int row = 1;
        int space = 0;
        int star = num;
        while(row<=num)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }

            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space+=2;
            row++;
            star--;
        }
    }
}
