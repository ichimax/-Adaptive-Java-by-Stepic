package d.digital_watches;

import java.util.Scanner;

/*Digital watches

Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59), i.e. first goes the number of hours, then goes the two-digit number of minutes, followed by the two-digit number of seconds. If necessary, number of minutes and seconds are filled by zeroes to a two-digit number.

N seconds passed from the beginning of the day. Output what the watches will display.

Input data format

Given the natural number N on input, not exceeding 107 (10000000).

Sample Input 1:

3602
Sample Output 1:

1:00:02
Sample Input 2:

129700
Sample Output 2:

12:01:40*/

public class DigitalWatches {

    public static void main(String[] args) {
        int rawSeconds = new Scanner(System.in).nextInt();
        System.out.printf("%d:%02d:%02d", rawSeconds / 3600 % 24, rawSeconds / 60 % 60, rawSeconds % 60);
    }
}
