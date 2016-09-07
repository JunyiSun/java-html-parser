package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import a3.ConsoleOutput;


//test  ConsoleOutput class
public class ConsoleOutputTest {

  /**
   * outContent used to compare output on console to the String result expected.
   */

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  
  @Before
  public void setUp() throws Exception {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void tearDown() throws Exception {
    System.setOut(null);
  }

//test  generateOutput method
  @Test
  public void testConsoleOutput() {
    String[] input = {"sample2.html,sample1.html"};
    ConsoleOutput out = new ConsoleOutput();
    out.generateOutput(input);
    assertEquals(1595, outContent.toString().length());
  }

}
