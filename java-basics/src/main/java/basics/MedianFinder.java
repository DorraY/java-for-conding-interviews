package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//heap for finding the max or min easier
public class MedianFinder {
    Queue<Integer> minHeap = new PriorityQueue<>();
    Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    boolean even = true;

    public MedianFinder() {

    }

    public void addNum(int num) {
        //o(log n)
        if (even) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        even = !even;

    }

    public double findMedian() {
        //o(1)
        if (even) {
            return 1.0 * (maxHeap.peek() + minHeap.peek()) / 2;
        }
        return  maxHeap.peek();

    }

}
