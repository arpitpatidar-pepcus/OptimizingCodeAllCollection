package com.pepcus.codeoptimization.model;

public class Person implements Comparable<Person> {

  String firstName;
  String lastName;
  int age;
  String gender;
  long aadharNumber;
  long mobileNumber;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public Person() {
  }

  public Person(String firstName, String lastName, int age, String gender, long aadharNumber, long mobileNumber) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.aadharNumber = aadharNumber;
    this.mobileNumber = mobileNumber;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public long getAadharNumber() {
    return aadharNumber;
  }

  public void setAadharNumber(long aadharNumber) {
    this.aadharNumber = aadharNumber;
  }

  public long getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(long mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  @Override
  public int compareTo(Person person) {
    long compareAadhar = ((Person) person).getAadharNumber();

    // For Ascending order
    return (int)(this.aadharNumber - compareAadhar);

    // For Descending order do like this
    // return compareage-this.studentage;
  }

}
