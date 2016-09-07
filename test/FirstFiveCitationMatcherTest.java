package test;

import static org.junit.Assert.*;

import org.junit.Test;

import a3.FirstFiveCitationMatcher;


// test FirstFiveCitationMatcher class
public class FirstFiveCitationMatcherTest {

  // test extractFiveCitation method
  @Test
  public void testFirstFiveCitation() {

   String rawHTMLString =
       "<td id=\"col-citedby\"><a class=\"cit-dark-"
       + "link\" href=.*?>4</a></td>"+
           "<td id=\"col-citedby\"><a class=\"cit-dark-"
           + "link\" href=.*?>5</a></td>"+
           "<td id=\"col-citedby\"><a class=\"cit-dark-"
           + "link\" href=.*?>6</a></td>"+
           "<td id=\"col-citedby\"><a class=\"cit-dark-"
           + "link\" href=.*?>7</a></td>"+
           "<td id=\"col-citedby\"><a class=\"cit-dark-"
           + "link\" href=.*?>8</a></td>"+
           "<td id=\"col-citedby\"><a class=\"cit-dark-"
           + "link\" href=.*?>9</a></td>";
      FirstFiveCitationMatcher matcher = new FirstFiveCitationMatcher();   
      
        int citnum = matcher.extractFiveCitation(rawHTMLString);
        assertEquals(30, citnum);

  }
}
