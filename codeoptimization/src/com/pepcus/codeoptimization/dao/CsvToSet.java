package com.pepcus.codeoptimization.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.pepcus.codeoptimization.model.Person;

public class CsvToSet {

  String path;
  FileReader fis;
  
  public Set<Person> populateDataToHashSet() {
    Set<Person> persons = new HashSet<Person>();

    String line = "";
    String splitBy = ",";

    try {
      path = System.getProperty("user.dir") + "\\src\\com\\pepcus\\codeoptimization\\requirement\\SampleData.csv";
      fis = new FileReader(path);
      BufferedReader br = new BufferedReader(fis);
      br.readLine();
      while ((line = br.readLine()) != null) // returns a Boolean value
      {
        Person person = new Person();
        String[] personData = line.split(splitBy); // use comma as separator
        person.setFirstName(personData[1]);
        person.setLastName(personData[2]);
        person.setAge(Integer.valueOf(personData[3]));
        person.setGender(personData[4]);
        person.setAadharNumber(Long.valueOf(personData[5]));
        person.setMobileNumber(Long.valueOf(personData[6]));
        // person = new Person(personData[1], personData[2],
        // Integer.valueOf(personData[3]), personData[4],
        // Long.valueOf(personData[5]), Long.valueOf(personData[6]));
        persons.add(person);
      }
      br.close();
      fis.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return persons;
  }
  
  public Set<Person> populateDataToLinkedHashSet() {
    Set<Person> persons = new LinkedHashSet<Person>();

    String line = "";
    String splitBy = ",";

    try {
      path = System.getProperty("user.dir") + "\\src\\com\\pepcus\\codeoptimization\\requirement\\SampleData.csv";
      fis = new FileReader(path);
      BufferedReader br = new BufferedReader(fis);
      br.readLine();
      while ((line = br.readLine()) != null) // returns a Boolean value
      {
        Person person = new Person();
        String[] personData = line.split(splitBy); // use comma as separator
        person.setFirstName(personData[1]);
        person.setLastName(personData[2]);
        person.setAge(Integer.valueOf(personData[3]));
        person.setGender(personData[4]);
        person.setAadharNumber(Long.valueOf(personData[5]));
        person.setMobileNumber(Long.valueOf(personData[6]));
        // person = new Person(personData[1], personData[2],
        // Integer.valueOf(personData[3]), personData[4],
        // Long.valueOf(personData[5]), Long.valueOf(personData[6]));
        persons.add(person);
      }
      br.close();
      fis.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return persons;
  }
  
  public TreeSet<Person> populateDataToTreeSet() {
    TreeSet<Person> persons = new TreeSet<Person>();

    String line = "";
    String splitBy = ",";

    try {
      path = System.getProperty("user.dir") + "\\src\\com\\pepcus\\codeoptimization\\requirement\\SampleData.csv";
      fis = new FileReader(path);
      BufferedReader br = new BufferedReader(fis);
      br.readLine();
      while ((line = br.readLine()) != null) // returns a Boolean value
      {
        Person person = new Person();
        String[] personData = line.split(splitBy); // use comma as separator
        person.setFirstName(personData[1]);
        person.setLastName(personData[2]);
        person.setAge(Integer.valueOf(personData[3]));
        person.setGender(personData[4]);
        person.setAadharNumber(Long.valueOf(personData[5]));
        person.setMobileNumber(Long.valueOf(personData[6]));
        // person = new Person(personData[1], personData[2],
        // Integer.valueOf(personData[3]), personData[4],
        // Long.valueOf(personData[5]), Long.valueOf(personData[6]));
        persons.add(person);
      }
      br.close();
      fis.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return persons;
  }

}
