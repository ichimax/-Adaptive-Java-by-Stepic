package d.direction;

import java.util.Scanner;

class Direction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        final String[] actions = {"do not move", "move up", "move down", "move left", "move right"};
        System.out.println((position >= 0 && position < 5) ? actions[position] : "error!");
    }
}