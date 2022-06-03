package com.pepcus.codeoptimization.controller;

import java.util.Collections;
import java.util.List;

import com.pepcus.codeoptimization.dao.CsvToList;
import com.pepcus.codeoptimization.model.Person;

public class ListController {
  long timeTaken;
  CsvToList csvToList = new CsvToList();;
  List<Person> personArrayList;
  List<Person> personLinkedList;

  /*
   * Insertion
   * 
   */
  public long checkInsertionAtEndOfArrayList(Person person) {
    personArrayList = csvToList.populateDataToArrayList();
    timeTaken = System.currentTimeMillis();
    personArrayList.add(person);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionAtBeginningOfArrayList(Person person) {
    timeTaken = System.currentTimeMillis();
    personArrayList.add(0, person);
    // System.out.println(personArrayList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionInMiddleOfArrayList(Person person) {
    timeTaken = System.currentTimeMillis();
    personArrayList.add(personArrayList.size() / 2, person);
    // System.out.println(personArrayList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionAtEndOfLinkedList(Person person) {
    personLinkedList = csvToList.populateDataToLinkedList();
    timeTaken = System.currentTimeMillis();
    personLinkedList.add(person);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionAtBeginningOfLinkedList(Person person) {
    // List<Person> personList = csvToDataStructure.populateDataToLinkedList();
    timeTaken = System.currentTimeMillis();
    personLinkedList.add(0, person);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionInMiddleOfLinkedList(Person person) {
    // List<Person> personList = csvToDataStructure.populateDataToLinkedList();
    timeTaken = System.currentTimeMillis();
    personLinkedList.add(personLinkedList.size() / 2, person);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  /*
   * Updation
   * 
   */
  public long checkUpdationAtEndOfArrayList(Person person) {
    timeTaken = System.currentTimeMillis();
    personArrayList.set(personArrayList.size() - 1, person);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationAtBeginningOfArrayList(Person person) {
    timeTaken = System.currentTimeMillis();
    personArrayList.set(0, person);
    // System.out.println(personArrayList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationInMiddleOfArrayList(Person person) {
    timeTaken = System.currentTimeMillis();
    personArrayList.set(personArrayList.size() / 2, person);
    // System.out.println(personArrayList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationAtEndOfLinkedList(Person person) {
    // personLinkedList = csvToList.populateDataToLinkedList();
    timeTaken = System.currentTimeMillis();
    personLinkedList.set(personLinkedList.size() - 1, person);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationAtBeginningOfLinkedList(Person person) {
    // List<Person> personList = csvToDataStructure.populateDataToLinkedList();
    timeTaken = System.currentTimeMillis();
    personLinkedList.set(0, person);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationInMiddleOfLinkedList(Person person) {
    // List<Person> personList = csvToDataStructure.populateDataToLinkedList();
    timeTaken = System.currentTimeMillis();
    personLinkedList.set(personLinkedList.size() / 2, person);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  /*
   * *************** Deletion*********************
   */
  public long checkDeletionAtEndOfArrayList() {
    timeTaken = System.currentTimeMillis();
    personArrayList.remove(personArrayList.size() - 1);
    // System.out.println(personArrayList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkDeletionAtBeginningOfArrayList() {
    timeTaken = System.currentTimeMillis();
    personArrayList.remove(0);
    // System.out.println(personArrayList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkDeletionAtMiddleOfArrayList() {
    timeTaken = System.currentTimeMillis();
    personArrayList.remove(personArrayList.size() / 2);
    // System.out.println(personArrayList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkDeletionAtBeginningOfLinkedList() {
    timeTaken = System.currentTimeMillis();
    personLinkedList.remove(0);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkDeletionAtEndOfLinkedList() {
    timeTaken = System.currentTimeMillis();
    personLinkedList.remove(personLinkedList.size() - 1);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkDeletionAtMiddleOfLinkedList() {
    timeTaken = System.currentTimeMillis();
    personLinkedList.remove(personLinkedList.size() / 2);
    // System.out.println(personLinkedList.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long sortingArrayList() {
    timeTaken = System.currentTimeMillis();
    Collections.sort(personArrayList);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long sortingLinkedList() {
    timeTaken = System.currentTimeMillis();
    Collections.sort(personLinkedList);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }
}
