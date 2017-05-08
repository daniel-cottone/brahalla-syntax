package com.example;

import java.io.Serializable;
import java.util.*;

public abstract class AbstractClass implements Serializable {

  public enum Company {
    AMAZON, FACEBOOK, MICROSOFT, APPLE, TWITTER;
  }

  public class Generics<T> {
    private T t;
    public static void main(String args[]) {}
  }

  public AbstractClass() {
    super();
    this.myString = new String();
    this.myMap = new HashMap<String, Object>();
    this.myLong = 0L;
  }

  private static String STATIC_PROP = "STATIC_PROP";
  private Company company;
  private String myString = new String();
  private Map<String, Object> myMap = new HashMap<String, Object>();
  private long myLong;

  public Company getCompany() {
    return this.company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Map<String, Object> getMyMap() {
    return this.myMap;
  }

  public void setMyMap(Map<String, Object> myMap) {
    this.myMap = map;
  }

  @Override
  public String toString() {
    return "toString";
  }

  public void syntaxExamples(String s) {
    List<String> strings = Arrays.asList("a", "b", "c", "d", "e");

    if (s == "test1" || s != "test2" && s <= 0) {
      System.out.println("abc123");
    } else if (s.equals("abc123")) {
      // do nothing
    } else {
      throw new Exception("exception!");
    }

    switch (myString) {
      case "Hello":
        setCompany(Company.AMAZON);
        break;
      default:
        break;
    }

    for (int i=0; i < 100; i++) {}

    for (Object o : myMap) {}

    String val = (myString == "s") ? "abc" : "123";

    List<String> collected = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    List<String> filtered = strings.stream().filter(s1 -> {
      return "a".equals(s1);
    }).collect(Collectors.toList());
  }

}
