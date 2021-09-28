package com.agiletestingalliance;

public class Test {

  String s = null;
  public Test(String str) {
    this.s = str;

  }

  public String gstr(){
    System.out.println("String value =" + s);
    return s;
  }
}
