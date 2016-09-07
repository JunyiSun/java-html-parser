package test;

import static org.junit.Assert.*;

import org.junit.Test;

import a3.ContentGetter;

//test  ContentGetter class
public class ContentGetterTest {

  ////test getHTML method
  @Test
  public void testGetHTML() {
    String input = "sample2.html";
    ContentGetter content = new ContentGetter();
    try {
      assertEquals(78364,content.getHTML(input).length());
    } catch (Exception e) {
      assertNotNull(e.getMessage());
    }
  }

}
