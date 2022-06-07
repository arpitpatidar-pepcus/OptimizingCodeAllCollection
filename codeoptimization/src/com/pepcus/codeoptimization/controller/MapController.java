package com.pepcus.codeoptimization.controller;

import java.util.Comparator;
import java.util.Map;

import com.pepcus.codeoptimization.dao.CsvToMap;

public class MapController {
  // HashMap, LinkedHashMap, TreeMap
  long timeTaken;
  CsvToMap csvToMap = new CsvToMap();
  Map<Integer, String> personHashMap;
  Map<Integer, String> personLinkedHashMap;
  Map<Integer, String> personTreeMap;

  public long checkInsertionOfHashMap(int id, String firstName) {
    personHashMap = csvToMap.populateDataToHashMap();
    timeTaken = System.currentTimeMillis();
    personHashMap.put(id, firstName);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationOfHashMap(int id, String firstName) {
    // personHashMap = csvToMap.populateDataToHashMap();
    timeTaken = System.currentTimeMillis();
    if (personHashMap.containsKey(id)) {
      personHashMap.replace(id, firstName);
    } else {
      System.out.println("key not available to update HashMap");
    }
    // System.out.println(personHashMap.size());
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionOfLinkedHashMap(int id, String firstName) {
    personLinkedHashMap = csvToMap.populateDataToLinkedHashMap();
    timeTaken = System.currentTimeMillis();
    personLinkedHashMap.put(id, firstName);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationOfLinkedHashMap(int id, String firstName) {
    // personLinkedHashMap = csvToMap.populateDataToLinkedHashMap();
    timeTaken = System.currentTimeMillis();
    if (personLinkedHashMap.containsKey(id)) {
      personLinkedHashMap.replace(id, firstName);
    } else {
      System.out.println("key not available to update in LinkedHahsMap");
    }
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkInsertionOfTreeMap(int id, String firstName) {
    personTreeMap = csvToMap.populateDataToTreeMap();
    timeTaken = System.currentTimeMillis();
    personTreeMap.put(id, firstName);
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long checkUpdationOfTreeMap(int id, String firstName) {
    // personTreeMap = csvToMap.populateDataToTreeMap();
    timeTaken = System.currentTimeMillis();
    if (personTreeMap.containsKey(id)) {
      personTreeMap.replace(id, firstName);
    } else {
      System.out.println("key not available to update in TreeMap");
    }
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }

  public long sortingHashMap() {
    timeTaken = System.currentTimeMillis();
    personHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }
  
  public long sortingLinkedHashMap() {
    timeTaken = System.currentTimeMillis();
    personLinkedHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }
  
  public long sortingTreeMap() {
    timeTaken = System.currentTimeMillis();
    personTreeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    timeTaken = System.currentTimeMillis() - timeTaken;
    return timeTaken;
  }
}
