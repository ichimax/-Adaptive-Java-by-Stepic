package t.the_longest_word;

import java.util.Scanner;

/*Введите слова, разделенные между собой одним пробелом.
Найдите среди них самое длинное и самое короткое.
При этом, если одинаковых по длине длинных слов окажется несколько, то выводите в консоль только самое последнее; если коротких слов окажется несколько, то выводите самое первое

Пример ввода:
Учите язык Java каждый день

Пример вывода:
каждый
язык
*/

public class wordLengthRu {

    public static void main(String[] args) {
        String[] words = new Scanner(System.in).nextLine().trim().split(" ");
        String longWord = words[0];
        String shortWord = longWord;

        for(String word : words) {
            if(word.length() >= longWord.length()) {
                longWord = word;
            } else if(word.length() < shortWord.length()) {
                shortWord = word;
            }
        }
        System.out.println(longWord + "\n" + shortWord);
    }
}
