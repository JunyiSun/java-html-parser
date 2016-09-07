package test;

import static org.junit.Assert.*;


import org.junit.Test;

import a3.CitationNumberMatcher;
import exceptions.NoMatchException;

//test CitationNumberMatcher class
public class CitationNumberMatcherTest {
   //test extractCitationNumber method
  @Test
  public void testCitationNumber() {
    String rawHTMLString = "Citations</a></td><td class=\"cit-"
        + "borderleft cit-data\">200</td>";
    CitationNumberMatcher matcher = new CitationNumberMatcher();   
    try {
      int num = matcher.extractCitationNumber(rawHTMLString);
      assertEquals(200, num);
    } catch (NoMatchException e) {
      assertNotNull(e.getMessage());
    }
  }

}
