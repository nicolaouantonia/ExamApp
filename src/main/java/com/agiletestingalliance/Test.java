package com.agiletestingalliance;

public class Test {

  String myString = null;
  public Test(String str) {
    this.myString = str;

  }

  public String gstr(){
    System.out.println("String value =" + myString);
    return myString;
  }
}
