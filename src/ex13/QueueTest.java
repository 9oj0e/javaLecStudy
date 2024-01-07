package ex13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            q.add(i);
        System.out.println("큐의 요소: " + q);

        int e = q.remove();
        // remove() method removes and retrieves the head of the queue
        // and assigns it to the variable int 'e'.
        System.out.println("삭제된 요소: " + e);
        System.out.println(q);
    }
}
