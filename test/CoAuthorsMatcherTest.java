package test;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

import a3.CoAuthorsMatcher;


//test CoAuthorMatcher class
public class CoAuthorsMatcherTest {

  ////test extractCoAuthor method
  @Test
  public void testCoAuthorName() {
    String rawHTMLString =
        "<a class=\"cit-dark-link\" href=\"jhk\" title=\"\">Jasmine Lu</a>"+
            "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>Lucille</a>"+
            "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>Monica</a>"+
            "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>Lucy Lee</a>";
    CoAuthorsMatcher matcher = new CoAuthorsMatcher();   
    
      TreeSet<String> authorset = matcher.extractCoAuthors(rawHTMLString);
      assertEquals(4, authorset.size());   
  }

}
