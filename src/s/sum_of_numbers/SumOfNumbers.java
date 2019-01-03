package s.sum_of_numbers;

import java.util.Scanner;

/*Given the sequence of numbers, ending with number 0.
Find the sum of all these numbers without using a loop.

Sample Input:

1
7
9
0
Sample Output:

17*/

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(sum(scanner, scanner.nextInt()));
    }

    private static int sum(Scanner scanner, int number) {
        return number != 0 ? number + sum(scanner, scanner.nextInt()) : number;
    }
}
