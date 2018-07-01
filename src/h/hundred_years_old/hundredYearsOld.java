package h.hundred_years_old;

import java.util.Scanner;
//import java.time.LocalDate;
//import java.time.Month;

/*Write a program, which takes the name and age of a person as input (in a single line, space-separated), and finds the year when this person turns 100 years old.

Let's assume that today is December 31, 2016.

P.S. The output must be exactly in the format which is specified in the example below.

Sample Input:

Vladimir 45
Sample Output:

Vladimir, You will be 100 years old in 2071 year.*/

public class hundredYearsOld {

    public static void main(String[] args) {
//        String[] data = new Scanner(System.in).nextLine().split(" ");
//        System.out.println(data[0] + ", You will be 100 years old in "
//            + LocalDate.of(2016, Month.DECEMBER, 31).plusYears(100 - Integer.valueOf(data[1])).getYear() + " year");

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next()
            + ", You will be 100 years old in "
            + (2016 + 100 - scanner.nextInt()) + " year.");
    }
}
