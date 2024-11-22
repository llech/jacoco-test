package com.github.llech.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleUtilsTest
{
  @Test
  public void testA()
  {
    Assertions.assertEquals("one", SampleUtils.getSampleStringForInt(1));
  }
  @Test
  public void testB()
  {
    Assertions.assertEquals("two", SampleUtils.getSampleStringForInt(2));
  }
}
