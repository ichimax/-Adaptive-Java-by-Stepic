package Interval;

import java.util.Scanner;

/*IntervalGiven an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).Please note the different brackets, which are used to specify intervals. The problem uses semi-open and open intervals. You can read more about it on the Wikipedia.*/

public class Interval {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        System.out.println((number > -15 && number < 13) ||
                           (number > 14  && number < 17) ||
                           (number > 18) ? "True" : "False");
    }
}