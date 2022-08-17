package Lecture1;

import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int row = 1;
        int space = num -1;
        int star = 1;

        while(row<=num)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }

            int j=1;
            while(j<=2*star-1)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            space--;
            star++;
        }
    }
}
