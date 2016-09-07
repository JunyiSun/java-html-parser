package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import driver.MyParser;

public class MyParserTest {

  /**
   * outContent used to compare output on console to the String result expected.
   */

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  
  /**
   * Initializes PrintStream before each test method.
   */
  @Before
  public void setUp() throws Exception {
    System.setOut(new PrintStream(outContent));
  }

  /**
   * Deletes OutputStream after each test method.
   */
  @After
  public void tearDown() throws Exception {
    System.setOut(null);
  }
  
  /**
   * Test main method.
   */
  @Test
  public void testMain() {
    String[] input = {"sample2.html,sample1.html"};
    MyParser.main(input);
    assertEquals(1595, outContent.toString().length());
  }

}
