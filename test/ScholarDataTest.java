package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import a3.AuthorNameMatcher;
import a3.CitationNumberMatcher;
import a3.CoAuthorsMatcher;
import a3.CoAuthorsNumberMatcher;
import a3.ContentGetter;
import a3.FirstFiveCitationMatcher;
import a3.IndexNumberMatcher;
import a3.ScholarData;
import a3.TitlesOfPublicationsMatcher;


// test SholarData class
public class ScholarDataTest {
  AuthorNameMatcher nameMatcher;
  CitationNumberMatcher citationMatcher;
  IndexNumberMatcher indexMatcher;
  TitlesOfPublicationsMatcher titMatcher;
  FirstFiveCitationMatcher fiveCitMatcher;
  CoAuthorsNumberMatcher coAuthorsNumMatcher;
  CoAuthorsMatcher coAuthorsMatcher;
   
  
  //instantiated potential used objects
  @Before
  public void setUp() throws Exception {
    nameMatcher = new AuthorNameMatcher();
    citationMatcher = new CitationNumberMatcher();
    indexMatcher = new IndexNumberMatcher();
    titMatcher = new TitlesOfPublicationsMatcher();
    fiveCitMatcher = new FirstFiveCitationMatcher();
    coAuthorsNumMatcher = new CoAuthorsNumberMatcher();
    coAuthorsMatcher = new CoAuthorsMatcher();
  }

  @After
  public void tearDown() throws Exception {}

  
//test SholarData constructor and getters
  @Test
  public void testScholarData() {
    String input = "sample2.html";
    ContentGetter content = new ContentGetter();
    String rawHTMLString;
    try {
      rawHTMLString = content.getHTML(input); 
      // extract required data
      String authorName = nameMatcher.extractAuthorsName(rawHTMLString);
      int citationNumber = citationMatcher.extractCitationNumber(rawHTMLString);
      int indexNumber = indexMatcher.extractIndexNumber(rawHTMLString);
      ArrayList<String> titles = titMatcher.extractTitles(rawHTMLString);
      int fiveCitTotal = fiveCitMatcher.extractFiveCitation(rawHTMLString);
      int coAuthorsNum = coAuthorsNumMatcher.extractCoAuthorNum(rawHTMLString);
      TreeSet<String> coAuthorsSet =
          coAuthorsMatcher.extractCoAuthors(rawHTMLString);
      // instantiate a new scholar data object
      ScholarData newAuthor =
          new ScholarData(authorName, citationNumber, indexNumber, titles,
              fiveCitTotal, coAuthorsNum, coAuthorsSet);
      assertEquals("Yan Xu", newAuthor.getAuthorName());
      assertEquals(263, newAuthor.getNumberOfCitations());
      assertEquals(9, newAuthor.getNumberOfIndex());
      assertEquals(14, newAuthor.getCoAuthorNames().size());
      assertEquals(14, newAuthor.getTotalCoAuthors());
      assertEquals(158, newAuthor.getTotal5Citations());
      assertEquals("Sociable killers: understanding social relationships "
          + "in an online first-person shooter game", 
          newAuthor.getTitlesOfThreePub().get(2));
    } catch (Exception e) {
      assertNotNull(e.getMessage());
    }



  }

}
