package ex13;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /*
        Elements in a PriorityQueue are ordered
        according to their natural ordering (or by a specified Comparator),
        and the queue does not permit null elements.
        */
        pq.add(30);
        pq.add(80);
        pq.add(20);
        /*
        Initially, the PriorityQueue contains elements 30, 80, and 20.
        As per the natural ordering, the least element is 20.
        */
        System.out.println(pq);
        System.out.println("삭제된 원소: " + pq.remove());
        /*
        Therefore, when you call pq.remove(),
        it removes and returns the least element in the queue,
        which is 20.
        */
    }
}
