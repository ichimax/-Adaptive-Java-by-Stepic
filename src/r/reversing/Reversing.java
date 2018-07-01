package r.reversing;

import java.util.Scanner;

/*Write a program that reads a three digit number, calculates the new number by r.reversing its digits, and outputs a new number.

Sample Input:

682
Sample Output:

286*/

public class Reversing {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        System.out.printf("%d%d%d", number % 100 % 10, number % 100 / 10, number / 100);
    }
}
