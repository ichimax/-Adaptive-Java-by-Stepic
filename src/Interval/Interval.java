package Interval;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        System.out.println((number > -15 && number < 13) ||
                           (number > 14  && number < 17) ||
                           (number > 18) ? "True" : "False");
    }
}