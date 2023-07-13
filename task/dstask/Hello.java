import java.util.*;

import org.w3c.dom.Node;

public class Hello {

  public static void main(String[] args) {

    int sum = 0;

    int[] s = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < s.length; i++) {
      sum = sum + s[i];
    }

    int[] sumArray = { sum };
    System.out.println(" Sum of elements in the integer array : " + Arrays.toString(sumArray));

    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    Stack<Integer> stack = new Stack<>();

    for (Integer element : linkedList) {
      stack.push(element);

    }

    int size = stack.size();
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = stack.pop();
    }

    for (int i = 0; i < size; i++) {
      System.out.println("Reversed elements " + array[i]);
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);

    Queue<Integer> evenIndex = new LinkedList<>();

    int index = 0;

    for (Integer value : queue) {
      if (index % 2 == 0) {
        System.out.println("Value at even index " + index + ": " + value);
        evenIndex.add(value);
      }
      index++;

    }

    Map<Integer, String> map = new HashMap<>();

    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Mango");
    map.put(4, "Guava");

    index = 1;
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      if (index % 2 != 0) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
      }
      index++;
    }

  }

}
