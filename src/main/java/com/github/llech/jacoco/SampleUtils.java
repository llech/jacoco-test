package com.github.llech.jacoco;

public class SampleUtils
{
  public static final String getSampleStringForInt(int a)
  {
    switch (a){
      case 0:
        return "zero";
      case 1:
        return "one";
        case 2:
          return "two";
      default:
        return "unknown";
    }
  }
}
