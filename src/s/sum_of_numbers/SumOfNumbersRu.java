package s.sum_of_numbers;

import java.util.Scanner;

/*
Given the sequence of numbers, ending with number -1.
Find the sum of all these numbers without using a loop.

Sample Input:
1
2
3
-1

Sample Output:
6


Sample Input:
-1

Sample Output:
0
*/

public class SumOfNumbersRu {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sum(sc.nextInt()));
    }

    private static int sum(int number) {
        return number > -1 ? number + sum(sc.nextInt()) : 0;
    }
}
