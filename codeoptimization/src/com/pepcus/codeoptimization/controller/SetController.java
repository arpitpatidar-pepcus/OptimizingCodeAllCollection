package com.pepcus.codeoptimization.controller;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.pepcus.codeoptimization.dao.CsvToSet;
import com.pepcus.codeoptimization.model.Person;

public class SetController {
  // HashSet, LinkedHashSet and TreeSet
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
      //System.out.println("removed");
      personHashSet.add(upatePerson);
    }
    // System.out.println(personHashSet.size() + " hashset");
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationInLinkedHashSet(Person person) {
    timeTaken = System.currentTimeMillis();
    if (personLinkedHashSet.remove(person)) {
      //System.out.println("removed");
      personLinkedHashSet.add(upatePerson);
    }
    // System.out.println(personHashSet.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationInTreeSet(Person person) {
    timeTaken = System.currentTimeMillis();
    if (personTreeSet.remove(person)) {
      //System.out.println("removed");
      personTreeSet.add(upatePerson);
    }
    // System.out.println(personHashSet.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }
  
  public long sortHashSet() {
    timeTaken = System.currentTimeMillis();
    Iterator itr = personHashSet.iterator();
    int i = 0;
    while (itr.hasNext() && i < 10) {
      
       System.out.println(((Person)(itr.next())).getAadharNumber());
      i++;
      
    }
    
    TreeSet<Person> tree_set = new TreeSet<>(personHashSet);
    // System.out.println(personHashSet.size() + " hashset");
    i = 0;
    itr = tree_set.iterator();
    while (itr.hasNext() && i < 10) {
      System.out.println(((Person)(itr.next())).getAadharNumber());
      i++;
    }
    
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }
}
