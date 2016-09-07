package test;

import static org.junit.Assert.*;

import org.junit.Test;

import a3.OutputFormatter;

// test OutputFormatter class
public class OutputFormatterTest {

  //test getFormattedOutput() method
  @Test
  public void testOutputFormatter() {
    String[] input = {"sample2.html","sample1.html"};
    OutputFormatter formatter = new OutputFormatter();
    formatter.setFormattedOutput(input);
    assertEquals(1594,formatter.getFormattedOutput().length());
  }

}
