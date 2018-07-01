package f.fractional_part;

import java.util.Scanner;

/*Fractional part 1

Given a positive real number X. Output its fractional part.

Sample Input:

17.9
Sample Output:

0.9*/

public class FractionalPart {

    public static void main(String[] args) {
        double a = new Scanner(System.in).nextDouble();
        System.out.print(a - (int)a);
    }
}
