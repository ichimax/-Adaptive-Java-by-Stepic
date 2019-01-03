package c.collatz_conjecture;

/*Дано натуральное число n. Создайте последовательность целых чисел, описанную в гипотезе Коллатца:

Если n - четное число, разделите его пополам, если оно нечетное, умножьте его на 3 и добавьте 1. Повторяйте эту операцию, пока мы не получится число 1.

Например, если число n = 17 (42), то последовательность выглядит следующим образом:
17 52 26 13 40 20 10 5 16 8 4 2 1

Пример ввода:
33

Пример вывода:
33 100 50 25 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
*/

import java.util.ArrayList;
import java.util.List;

public class CollatzConjectureRu {

    public static void main(String[] args) {
        List<Integer> maxSequence = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();

        for(int i = 1, num; i <= 100; i++) {
            currentSequence.add(num = i);

            while(num > 1) {
                currentSequence.add(num = num % 2 == 0 ? num / 2 : num * 3 + 1);
            }

            if(currentSequence.size() > maxSequence.size()) {
                maxSequence = new ArrayList<>(currentSequence);
            }

            currentSequence.clear();
        }
        System.out.println(maxSequence + "\n" + "length: " + maxSequence.size());
    }
}