package u.uppercase;

import java.util.Scanner;

/*Input a single character and change its register. That is, if the lowercase letter has been entered – make it u.uppercase, and vice versa. Characters that are not Latin ones need to stay unchanged.

Sample Input:

b
Sample Output:

B*/

public class Uppercase {

    public static void main(String[] args) {
        char letter = new Scanner(System.in).nextLine().charAt(0);

        System.out.println((letter > 96 && letter < 123) ? (char)(letter - 32) :
                            (letter > 64 && letter < 91) ? (char)(letter + 32) : letter);

    }
}
