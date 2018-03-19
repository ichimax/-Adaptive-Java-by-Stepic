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
                if(!isZero(secondNumber)) {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "mod":
                if(!isZero(secondNumber)) {
                    System.out.println(Math.floorMod((int)firstNumber, (int)secondNumber));
                }
                break;
            case "pow":
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            case "div":
                if(!isZero(secondNumber)) {
                    System.out.println(Math.floorDiv((int)firstNumber, (int)secondNumber));
                }
                break;
            default:
                System.out.println("unknown operation " + operation);
        }
    }

    private static boolean isZero(double secondNumber) {
        if(secondNumber == 0) {
            System.out.println("Division by 0!");
            return true;
        }
        return false;
    }
}