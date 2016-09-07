package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import a3.TitlesOfPublicationsMatcher;

//test TitlesOfPublicationsMatcher class
public class TitlesOfPublicationsMatcherTest {

 
//test extractTitles method
  @Test
  public void testTitles() {
    String rawHTMLString =
        "class=\"cit-dark-large-link\">Hello</a><br>"+
    "class=\"cit-dark-large-link\">this</a><br>"+
            "class=\"cit-dark-large-link\">is me</a><br>"+
    "class=\"cit-dark-large-link\">What are you doing</a><br>"+
            "class=\"cit-dark-large-link\">I am good today</a><br>";
    TitlesOfPublicationsMatcher matcher = new TitlesOfPublicationsMatcher();   
       
         ArrayList<String> titles = matcher.extractTitles(rawHTMLString);
         assertEquals("is me", titles.get(2));
  }

}
