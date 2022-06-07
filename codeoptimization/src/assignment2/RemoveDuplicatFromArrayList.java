package assignment2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatFromArrayList {

  public static void main(String args[]) {
    List<Integer> numberList = new ArrayList<Integer>();
    long timeTaken;
    for (int i = 0; i < 100000; i++) {
      numberList.add((int) (Math.random() * 100));
    }
    timeTaken = System.currentTimeMillis();
    removeDuplicatesByIterator(numberList);
    System.out.println((System.currentTimeMillis() - timeTaken) + " ms. time taken using Iterator");

    timeTaken = System.currentTimeMillis();
    removeDuplicatesUsingHashSet(numberList);
    System.out.println((System.currentTimeMillis() - timeTaken)  + " ms. time taken using HashSet");

    timeTaken = System.currentTimeMillis();
    removeDuplicatesUsingDistinct(numberList);
    System.out.println((System.currentTimeMillis() - timeTaken)  + " ms. time taken using Stream Distinct");

  }

  public static List<Integer> removeDuplicatesByIterator(List<Integer> list) {
    List<Integer> newList = new ArrayList<Integer>();
    for (int element : list) {
      if (!newList.contains(element)) {
        newList.add(element);
      }
    }
    return newList;
  }

  public static List<Integer> removeDuplicatesUsingHashSet(List<Integer> list) {
    Set<Integer> set = new LinkedHashSet<>();
    set.addAll(list);
    list.clear();
    list.addAll(set);
    return list;
  }

  public static List<Integer> removeDuplicatesUsingDistinct(List<Integer> list) {
    List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
    return newList;
  }
}
