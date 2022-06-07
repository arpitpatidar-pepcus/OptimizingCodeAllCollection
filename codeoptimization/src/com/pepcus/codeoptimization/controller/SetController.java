package com.pepcus.codeoptimization.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.pepcus.codeoptimization.dao.CsvToSet;
import com.pepcus.codeoptimization.model.Person;

public class SetController {
  long timeTaken;
  CsvToSet csvToSet = new CsvToSet();;
  Set<Person> personHashSet;
  Set<Person> personLinkedHashSet;
  TreeSet<Person> personTreeSet;
  Person upatePerson = new Person("Jayesh", "Patidar", 23, "Male", 3333333, 9479975855l);

  public long checkInsertionInHashSet(Person person) {
    personHashSet = csvToSet.populateDataToHashSet();
    timeTaken = System.currentTimeMillis();
    // this.person = person;
    personHashSet.add(person);
    // System.out.println(personHashSet.size() + " hashset");
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionInLinkedHashSet(Person person) {
    personLinkedHashSet = csvToSet.populateDataToLinkedHashSet();
    timeTaken = System.currentTimeMillis();
    personLinkedHashSet.add(person);
    // System.out.println(personHashSet.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionInTreeSet(Person person) {
    personTreeSet = csvToSet.populateDataToTreeSet();
    timeTaken = System.currentTimeMillis();
    personTreeSet.add(person);
    // System.out.println(personHashSet.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationInHashSet(Person person) {
    timeTaken = System.currentTimeMillis();
    if (personHashSet.remove(person)) {
      // System.out.println("removed");
      personHashSet.add(upatePerson);
    }
    // System.out.println(personHashSet.size() + " hashset");
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationInLinkedHashSet(Person person) {
    timeTaken = System.currentTimeMillis();
    if (personLinkedHashSet.remove(person)) {
      // System.out.println("removed");
      personLinkedHashSet.add(upatePerson);
    }
    // System.out.println(personHashSet.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationInTreeSet(Person person) {
    timeTaken = System.currentTimeMillis();
    if (personTreeSet.remove(person)) {
      // System.out.println("removed");
      personTreeSet.add(upatePerson);
    }
    // System.out.println(personHashSet.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long sortHashSet() {
    timeTaken = System.currentTimeMillis();
    TreeSet<Person> tree_set = new TreeSet<>(personHashSet);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long sortLinkedHashSet() {
    timeTaken = System.currentTimeMillis();
    TreeSet<Person> tree_set = new TreeSet<>(personLinkedHashSet);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long sortTreeSet() {
    timeTaken = System.currentTimeMillis();

    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }
}


//Iterator itr = personHashSet.iterator();
// int i = 0;
// while (itr.hasNext() && i < 10) {
//
// System.out.println(((Person)(itr.next())).getAadharNumber());
// i++;
// }
// TreeSet<Person> tree_set = new TreeSet<>(personHashSet);
// System.out.println(personHashSet.size() + " hashset");
// List<Person> personList = new ArrayList<Person>(personHashSet);
// Collections.sort(personList);
// //personHashSet.stream().sorted(Comparator.reverseOrder());
// personHashSet = new HashSet<Person>(personList);