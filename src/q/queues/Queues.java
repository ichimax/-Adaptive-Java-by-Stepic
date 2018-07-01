package q.queues;

/*There is a queue of 4 elements. Put in it one more element - the number 5, and then get 2 items out of the queue.

Sample Input:

Sample Output:

[3, 4, 5]*/

import java.util.*;

public class Queues {

    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.add(5);
        queue.poll();
        queue.poll();

        System.out.println(queue);
    }
}