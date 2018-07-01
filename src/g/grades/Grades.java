package g.grades;

import java.util.Scanner;

/*
 Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in the class consisting of n students. The program gets number n as input, and then gets the grades themselves (one by one). The program should output four numbers in a single line - the number of "D", the number of "C", the number of "B" and the number of "A" grades.

Sample Input:

10
2
5
4
3
2
4
5
4
4
5
Sample Output:

2 1 4 3
*/

public class Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        int countStudents = scanner.nextInt();

        for(int i = 0; i < countStudents; i++) {
            switch(scanner.nextInt()) {
                case 2 :
                    d++;
                    break;
                case 3 :
                    c++;
                    break;
                case 4 :
                    b++;
                    break;
                case 5 :
                    a++;
                    break;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
