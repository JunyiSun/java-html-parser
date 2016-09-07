package test;

import static org.junit.Assert.*;

import org.junit.Test;


import a3.CoAuthorsNumberMatcher;


//test  CoAuthorNumberMatch class
public class CoAuthorsNumberMatcherTest {

 //test extractCoAuthorNum method
  @Test
  public void testCoAuthorNumber() {
    String rawHTMLString =
        "<a class=\"cit-dark-link\" href=\"jhk\" title=\"\">Jasmine Lu</a>"+
            "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>Lucille</a>"+
            "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>Monica</a>"+
            "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>Lucy Lee</a>";
    CoAuthorsNumberMatcher matcher = new CoAuthorsNumberMatcher();   
    
      int authornum = matcher.extractCoAuthorNum(rawHTMLString);
      assertEquals(4, authornum);  
  }

}
