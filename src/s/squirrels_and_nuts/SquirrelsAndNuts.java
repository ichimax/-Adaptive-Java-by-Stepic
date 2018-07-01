package s.squirrels_and_nuts;

import java.util.Scanner;

/*Squirrels and nuts - 1

N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.

Input data format

There are two positive numbers N and K, each of them is not greater than 10000.

Sample Input:

3
14
Sample Output:

4*/

public class SquirrelsAndNuts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squirrels = scanner.nextInt();
        System.out.print(scanner.nextInt() / squirrels);
    }
}
