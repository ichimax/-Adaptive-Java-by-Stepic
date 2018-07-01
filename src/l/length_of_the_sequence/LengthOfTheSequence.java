package l.length_of_the_sequence;

import java.util.Scanner;

/*On the input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence ends with an integer 0, when reading which the program should end its work and output the length of the sequence (not counting the final 0).

Don’t read numbers following the number 0.

Sample Input:

1
7
9
0
5
Sample Output:

3*/

public class LengthOfTheSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while(scanner.nextInt() != 0) {
            counter++;
        }

        System.out.println(counter);
    }
}
