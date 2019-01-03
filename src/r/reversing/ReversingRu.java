package r.reversing;

import java.util.Scanner;

/*Напишите программу, которая читает четырехзначное число, и выводит его в обратном порядок. Реализовать это без использования готовых методов.

Sample Input:

682
Sample Output:

286*/

public class ReversingRu {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        System.out.printf("%d%d%d", number % 100 % 10, number % 100 / 10, number / 100);
    }
}
