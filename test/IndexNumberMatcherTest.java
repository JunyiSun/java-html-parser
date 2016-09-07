package test;

import static org.junit.Assert.*;

import org.junit.Test;

import a3.IndexNumberMatcher;
import exceptions.NoMatchException;

// test IndexNumberMatcher class
public class IndexNumberMatcherTest {

   // test extractIndexNumber method
  @Test
  public void testIndexNumber() {
    String rawHTMLString =  "i10-index</a></td><td "
        + "class=\"cit-borderleft cit-data\">.*</td><td "
        + "class=\"cit-borderleft cit-data\">40</td>";
    IndexNumberMatcher matcher = new IndexNumberMatcher();   
    try {
      int num = matcher.extractIndexNumber(rawHTMLString);
      assertEquals(40, num);
    } catch (NoMatchException e) {
      assertNotNull(e.getMessage());
    }
  }

}
