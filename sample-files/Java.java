package com.example;

import java.io.Serializable;

public abstract class AbstractClass implements Serializable {

  private static String STATIC_PROP = "STATIC_PROP";
  private String myString;

  public String getMyString() {
    return this.myString;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }

  @Override
  public String toString() {
    return "toString";
  }

}
