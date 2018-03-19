package Calculator;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.valueOf(scanner.nextLine());
        double secondNumber = Double.valueOf(scanner.nextLine());
        String operation = scanner.nextLine();

        switch(operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                System.out.println(secondNumber == 0 ? "Division by 0!" : firstNumber / secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "mod":
                System.out.println(secondNumber == 0 ? "Division by 0!" :
                    Math.floorMod((int) firstNumber, (int) secondNumber));
                break;
            case "pow":
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            case "div":
                System.out.println(secondNumber == 0 ? "Division by 0!" :
                    Math.floorDiv((int) firstNumber, (int) secondNumber));
                break;
            default:
                System.out.println("unknown operation " + operation);
        }
    }
}