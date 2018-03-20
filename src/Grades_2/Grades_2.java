package Grades_2;

import java.util.Scanner;

public class Grades_2 {

    public static void main(String[] args) {
        String[] grades = new Scanner(System.in).nextLine().split(" ");

        int counter = 0;
        for(String grade : grades) {
            if(grade.equals("A")) {
                counter++;
            }
        }
        System.out.println((double) counter / grades.length);
    }
}
