package Heaps;

import java.util.*;


public class HeapMain {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        Scanner input = new Scanner(System.in);

        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(10);
        minHeap.add(8);
        minHeap.add(4);

        System.out.println(minHeap);
        System.out.printf("Smallest Element in the heap: %d%n", minHeap.peek());

        ArrayList<Object> storage = new ArrayList<>();
        while(!minHeap.isEmpty()){
           int removedElements = minHeap.poll();
           storage.add(removedElements);
        }
        System.out.println("The removed elements are: " + storage);


        System.out.println("Enter a number to put into the heap: ");
        int inputNumber = input.nextInt();
        minHeap.add(inputNumber);
        System.out.println("Heap after user insertion: " + minHeap);

        minHeap.remove();
        System.out.println("Elements removed from the heap: " + inputNumber);
        

        




        input.close();
    }
}
