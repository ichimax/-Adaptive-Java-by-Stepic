package c.collatz_conjecture;

/*Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:

If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.

For example, if the number n = 17, then the sequence looks as the following:
17 52 26 13 40 20 10 5 16 8 4 2 1
Such a sequence will stop at number 1 for any primary natural number n.

Output format:
Sequence of integers in a single line, separated by spaces.

Sample Input 1:

17
Sample Output 1:

17 52 26 13 40 20 10 5 16 8 4 2 1
Sample Input 2:

1
Sample Output 2:

1*/

import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.printf("%d ", number);
        while(number != 1) {
            number = number % 2 == 0 ? number / 2 : number * 3 + 1;
            System.out.printf("%d ", number);
        }
    }
}
