package u.uppercase;

import java.util.Scanner;

/*
+++
Введите одну букву, измените ее регистр и выведите на экран.
Если введена прописная буква, сделайте ее строчной и наоборот.
Буквы, которые не являются кирилицей, должны оставаться неизменными.
Методы класса String toUpperCase() и toLowerCase() использовать нельзя!

Пример ввода:
я

Результат:
Я

Пример ввода:
w

Результат:

*/

public class UppercaseRu {

    public static void main(String[] args) {
        char letter = new Scanner(System.in).nextLine().charAt(0);

        if(letter == 'Ё') {
            System.out.println('ё');
        } else if(letter == 'ё') {
            System.out.println('Ё');
        } else {
            System.out.println((letter >= 'А' && letter <= 'Я') ? (char)(letter + 32) :
                               (letter >= 'а' && letter <= 'я') ? (char)(letter - 32) : letter);
        }
    }
}
