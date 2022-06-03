package com.pepcus.codeoptimization.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CsvToMap {

  String path;
  FileReader fis;
  
  public Map<Integer , String> populateDataToHashMap() {
    Map<Integer , String> persons = new HashMap<Integer , String>();

    String line = "";
    String splitBy = ",";

    try {
      path = System.getProperty("user.dir") + "\\src\\com\\pepcus\\codeoptimization\\requirement\\SampleData.csv";
      fis = new FileReader(path);
      BufferedReader br = new BufferedReader(fis);
      br.readLine();
      while ((line = br.readLine()) != null) // returns a Boolean value
      {
        
        String[] personData = line.split(splitBy); // use comma as separator
        persons.put(Integer.valueOf(personData[0]), personData[1]);
      }
      br.close();
      fis.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return persons;
  }
  
  public Map<Integer , String> populateDataToLinkedHashMap() {
    Map<Integer , String> persons = new LinkedHashMap<Integer , String>();

    String line = "";
    String splitBy = ",";

    try {
      path = System.getProperty("user.dir") + "\\src\\com\\pepcus\\codeoptimization\\requirement\\SampleData.csv";
      fis = new FileReader(path);
      BufferedReader br = new BufferedReader(fis);
      br.readLine();
      while ((line = br.readLine()) != null) // returns a Boolean value
      {
        
        String[] personData = line.split(splitBy); // use comma as separator
        persons.put(Integer.valueOf(personData[0]), personData[1]);
      }
      br.close();
      fis.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return persons;
}
  
  public Map<Integer , String> populateDataToTreeMap() {
    Map<Integer , String> persons = new TreeMap<Integer , String>();

    String line = "";
    String splitBy = ",";

    try {
      path = System.getProperty("user.dir") + "\\src\\com\\pepcus\\codeoptimization\\requirement\\SampleData.csv";
      fis = new FileReader(path);
      BufferedReader br = new BufferedReader(fis);
      br.readLine();
      while ((line = br.readLine()) != null) // returns a Boolean value
      {
        
        String[] personData = line.split(splitBy); // use comma as separator
        persons.put(Integer.valueOf(personData[0]), personData[1]);
      }
      br.close();
      fis.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return persons;
}
}