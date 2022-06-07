package com.pepcus.codeoptimization;

import com.pepcus.codeoptimization.controller.ListController;
import com.pepcus.codeoptimization.controller.MapController;
import com.pepcus.codeoptimization.controller.SetController;
import com.pepcus.codeoptimization.model.Person;

public class ShowTime {

  public static void main(String[] args) {
    long timeTaken;
    ListController listController = new ListController();
    SetController setController = new SetController();
    MapController mapController = new MapController();
    Person person = new Person("Arpit", "Patidar", 24, "Male", 222222, 9907690402l);

    /*
     ************** Insertion******************
     */
    System.out.println("\n" + "********* Insertion in ArrayList and LinkedList ***********" + "\n");

    timeTaken = listController.checkInsertionAtEndOfArrayList(person);
    System.out.println(timeTaken + " ms. for insertion at end of ArrayList");

    timeTaken = listController.checkInsertionAtBeginningOfArrayList(person);
    System.out.println(timeTaken + " ms. for insertion at begining of ArrayList");

    timeTaken = listController.checkInsertionInMiddleOfArrayList(person);
    System.out.println(timeTaken + " ms. for insertion at middle of ArrayList");

    timeTaken = listController.checkInsertionAtEndOfLinkedList(person);
    System.out.println(timeTaken + " ms. for insertion at end of LinkedList");

    timeTaken = listController.checkInsertionAtBeginningOfLinkedList(person);
    System.out.println(timeTaken + " ms. for insertion at begining of LinkedList");

    timeTaken = listController.checkInsertionInMiddleOfLinkedList(person);
    System.out.println(timeTaken + " ms. for insertion at middle of LinkedList");

    /*
     ************** Updation in ArrayList and LinkedList******************
     */
    System.out.println("\n" + "********* update in ArrayList and LinkedList ***********" + "\n");

    timeTaken = listController.checkUpdationAtEndOfArrayList(person);
    System.out.println(timeTaken + " ms. for updation at end of ArrayList");

    timeTaken = listController.checkInsertionAtBeginningOfArrayList(person);
    System.out.println(timeTaken + " ms. for updation at begining of ArrayList");

    timeTaken = listController.checkInsertionInMiddleOfArrayList(person);
    System.out.println(timeTaken + " ms. for updation at middle of ArrayList");

    timeTaken = listController.checkInsertionAtEndOfLinkedList(person);
    System.out.println(timeTaken + " ms. for updation at end of LinkedList");

    timeTaken = listController.checkInsertionAtBeginningOfLinkedList(person);
    System.out.println(timeTaken + " ms. for updation at begining of LinkedList");

    timeTaken = listController.checkInsertionInMiddleOfLinkedList(person);
    System.out.println(timeTaken + " ms. for updation at middle of LinkedList");

    /*
     ************** Deletion in ArrayList and LinkedList******************
     */
    System.out.println("\n" + "********* Deletion in ArrayList and LinkedList ***********" + "\n");

    timeTaken = listController.checkDeletionAtEndOfArrayList();
    System.out.println(timeTaken + " ms. for deletion at end of ArrayList");

    timeTaken = listController.checkDeletionAtBeginningOfArrayList();
    System.out.println(timeTaken + " ms. for deletion at beginning of ArrayList");

    timeTaken = listController.checkDeletionAtMiddleOfArrayList();
    System.out.println(timeTaken + " ms. for deletion at middle of ArrayList");

    timeTaken = listController.checkDeletionAtEndOfLinkedList();
    System.out.println(timeTaken + " ms. for deletion at end of LinkedList");

    timeTaken = listController.checkDeletionAtBeginningOfLinkedList();
    System.out.println(timeTaken + " ms. for deletion at beginning of LinkedList");

    timeTaken = listController.checkDeletionAtMiddleOfLinkedList();
    System.out.println(timeTaken + " ms. for deletion at middle of LinkedList");

    /*
     ************** Insert and update in Set******************
     */
    System.out.println("\n" + "********* Insert  and update in Set ***********" + "\n");

    timeTaken = setController.checkInsertionInHashSet(person);
    System.out.println(timeTaken + " ms. for insertion in HashSet");

    timeTaken = setController.checkInsertionInLinkedHashSet(person);
    System.out.println(timeTaken + " ms. for insertion in LinkedHashSet");

    timeTaken = setController.checkInsertionInTreeSet(person);
    System.out.println(timeTaken + " ms. for insertion in LinkedHashSet");

    timeTaken = setController.checkUpdationInHashSet(person);
    System.out.println(timeTaken + " ms. for updation in HashSet");

    timeTaken = setController.checkUpdationInLinkedHashSet(person);
    System.out.println(timeTaken + " ms. for updation in LinkedHashSet");

    timeTaken = setController.checkUpdationInTreeSet(person);
    System.out.println(timeTaken + " ms. for updation in TreeSet");

    /*
     ************** Insert and updation in Map******************
     */
    System.out.println("\n" + "********* Insert and update in Map ***********" + "\n");

    timeTaken = mapController.checkInsertionOfHashMap(100010, "Arpit");
    System.out.println(timeTaken + " ms. for insertion in HashMap");

    timeTaken = mapController.checkUpdationOfHashMap(100000, "Ritik");
    System.out.println(timeTaken + " ms. for updation in HashMap");

    timeTaken = mapController.checkInsertionOfLinkedHashMap(100010, "Arpit");
    System.out.println(timeTaken + " ms. for insertion in LinkedHashMap");

    timeTaken = mapController.checkUpdationOfLinkedHashMap(100000, "Ritik");
    System.out.println(timeTaken + " ms. for updation in LinkedHashMap");

    timeTaken = mapController.checkInsertionOfTreeMap(100010, "Arpit");
    System.out.println(timeTaken + " ms. for insertion in TreeMap");

    timeTaken = mapController.checkUpdationOfTreeMap(100000, "Arpit");
    System.out.println(timeTaken + " ms. for updation in TreeMap");

    /*
     ************** Sorting time for all DataStructures******************
     */
    System.out.println("\n" + "********* Sorting time for all DataStructures***********" + "\n");

    timeTaken = listController.sortingArrayList();
    System.out.println(timeTaken + " ms. for sorting arraylist");
    
    timeTaken = listController.sortingLinkedList();
    System.out.println(timeTaken + " ms. for sorting LinkedList");
    
    timeTaken = setController.sortHashSet();
    System.out.println(timeTaken + " ms. for sorting HashSet");
    
    timeTaken = setController.sortLinkedHashSet();
    System.out.println(timeTaken + " ms. for sorting LinkedHashSet");
    
    timeTaken = setController.sortTreeSet();
    System.out.println(timeTaken + " ms. for sorting TreeSet");
    
    timeTaken = mapController.sortingHashMap();
    System.out.println(timeTaken + " ms. for sorting HashMap");
    
    timeTaken = mapController.sortingLinkedHashMap();
    System.out.println(timeTaken + " ms. for sorting LinkedHashMap");
    
    timeTaken = mapController.sortingTreeMap();
    System.out.println(timeTaken + " ms. for sorting TreeMaps");
 }
}
