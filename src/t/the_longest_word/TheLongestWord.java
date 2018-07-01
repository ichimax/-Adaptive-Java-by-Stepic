package t.the_longest_word;

import java.util.Scanner;

/*In the given string find the longest word and output it.

Input data

Given a string in a single line. Words in the string are separated by a single space.

Output data

Output the longest word. If there are several such words, you should output the one, which occurs earlier.

Sample Input:

Everyone of us has all we need
Sample Output:

Everyone*/

public class TheLongestWord {

    public static void main(String[] args) {
        String maxLength = "";

        for(String word : new Scanner(System.in).nextLine().split(" ")) {
            if(word.length() > maxLength.length()) {
                maxLength = word;
            }
        }

        System.out.print(maxLength);
    }
}
