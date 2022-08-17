package Lecture1;
import java.util.Scanner;

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
