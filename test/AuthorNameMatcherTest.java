package test;

import static org.junit.Assert.*;


import org.junit.Test;

import exceptions.NoMatchException;
import a3.AuthorNameMatcher;

//test AuthorNameMatcher class
public class AuthorNameMatcherTest {
  //test extractAuthorsName method
  @Test
  public void testAuthorNameMatcher() {
    String rawHTMLString = "<span id=\"cit-name-display\" "
        + "class=\"cit-in-place-nohover\">Katherine Sun</span>";
    AuthorNameMatcher nameMatcher = new AuthorNameMatcher();
    String name;
    try {
      name = nameMatcher.extractAuthorsName(rawHTMLString);
      assertEquals("Katherine Sun", name);
    } catch (NoMatchException e) {
      assertNotNull(e.getMessage());
    }
    
  }

}
