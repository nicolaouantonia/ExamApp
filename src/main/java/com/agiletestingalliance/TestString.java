package com.agiletestingalliance;

public class TestString {

  String myString = null;
  public TestString(String str) {
    this.myString = str;

  }

  public String gstr(){
    System.out.println("String value =" + myString);
    return myString;
  }
}
