package p.pie;

import java.util.Scanner;

/*In the Bioinformatics Institute a competition is held between the computer science and biology students. The winners will get a large and tasty p.pie. The team of biology students consists of a students, computer science team — b students.

It is necessary to pre-cut the p.pie so that it would be possible to distribute the pieces of the p.pie to any team that won the competition, with each member of this team should get the same number of pieces of the p.pie. And since you do not want to cut the p.pie into the too many small pieces, you need to find the minimum suitable number.

Write a program, which helps to find this number.

The program gets the size of the teams (two positive integers a and b, each number is entered in a separate line) and should output the smallest number d, which is divisible by both numbers without remainder.

Sample Input 1:

7
5
Sample Output 1:

35
Sample Input 2:

15
15
Sample Output 2:

15
Sample Input 3:

12
16
Sample Output 3:

48*/

public class Pie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(nok(sc.nextInt(), sc.nextInt()));
    }

    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    private static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}

