//**********************************************************
//Assignment3:
//CDF user_name:c5sunjun
//
//Author:Junyi Sun
//
//
//Honor Code: I pledge that this program represents my own
//program code and that I have coded on my own. I received
//help from no one in designing and debugging my program.
//*********************************************************
package a3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import exceptions.NoMatchException;

/**
 * The class that extracts required information from the HTML page
 *
 */
public class PatternMatcher {
  //An ArrayList of all raw HTML strings
  private List<String> rawHTML = new ArrayList<String>();
  //An ArrayList of all author's data
  private List<ScholarData> authors = new ArrayList<ScholarData>();
  //A TreeSet that stores all coAuthors' names
  private Set<String> coAuthors = new TreeSet<String>();
  
  /**
   * Constructor of the class, it sets the HTML, authors' data 
   * and coAuthors' names for each scholar's URL 
   * @param urls A list of user provided urls
   */
  public PatternMatcher(String[] urls){
    for(String googleScholarURL: urls){
      addRawHTML(googleScholarURL);
      addAuthors(rawHTML.get(rawHTML.size()-1));
      addCoAuthors(rawHTML.get(rawHTML.size()-1));
    }
    
  }

  /**
   * Add coAuthors' name to the coAuthors' set
   * @param rawHTMLString string of raw HTML page 
   */
  private void addCoAuthors(String rawHTMLString) {
    CoAuthorsMatcher coAuthorsMatcher = new CoAuthorsMatcher();
    TreeSet<String> coAuthorsSet = coAuthorsMatcher
        .extractCoAuthors(rawHTMLString);
    for (String coAuthor: coAuthorsSet){
      this.coAuthors.add(coAuthor);
    }
  }


  /**
   * Add authors' name to the authors' list
   * @param rawHTMLString string of raw HTML page
   */
  private void addAuthors(String rawHTMLString) {  
    //instantiate different matchers to extract different information
    AuthorNameMatcher nameMatcher = new AuthorNameMatcher();
    CitationNumberMatcher citationMatcher = new CitationNumberMatcher();
    IndexNumberMatcher indexMatcher = new IndexNumberMatcher();
    TitlesOfPublicationsMatcher titMatcher = new TitlesOfPublicationsMatcher();
    FirstFiveCitationMatcher fiveCitMatcher = new FirstFiveCitationMatcher();
    CoAuthorsNumberMatcher coAuthorsNumMatcher = new CoAuthorsNumberMatcher();
    CoAuthorsMatcher coAuthorsMatcher = new CoAuthorsMatcher();
    try{
      //extract required data
      String authorName = nameMatcher.extractAuthorsName(rawHTMLString);
      int citationNumber = citationMatcher.extractCitationNumber(rawHTMLString);
      int indexNumber = indexMatcher.extractIndexNumber(rawHTMLString);
      ArrayList<String> titles = titMatcher.extractTitles(rawHTMLString);
      int fiveCitTotal = fiveCitMatcher.extractFiveCitation(rawHTMLString);
      int coAuthorsNum = coAuthorsNumMatcher.extractCoAuthorNum(rawHTMLString);
      TreeSet<String> coAuthorsSet = coAuthorsMatcher
          .extractCoAuthors(rawHTMLString);
      //instantiate a new scholar data object
      ScholarData newAuthor = new ScholarData(authorName, citationNumber, 
          indexNumber,titles, fiveCitTotal,coAuthorsNum, coAuthorsSet);
      // add the new scholar data object to the list of scholars
      authors.add(newAuthor);
    }
    catch(NoMatchException e){
      System.out.println("Please provide a valid google scholar HTML page.");
    }
  }
  
  
  /**
   * Add raw HTML string to the HTML list
   * @param googleScholarURL user input HTML's url
   */
  private void addRawHTML(String googleScholarURL) {
    try{
    ContentGetter googleScholarContent = new ContentGetter();
    rawHTML.add(googleScholarContent.getHTML(googleScholarURL));
  } catch (Exception e) {
    System.out.println("malformed URL or cannot open connection to "
        + "given URL");
   }
  }
  
  
  /**
   * Get authors' data
   * @return List of all scholars' data
   */
  public List<ScholarData> getAuthors(){
    return authors;
  }
  
  /**
   * Get coAuthors' names
   * @return Set of all coAuthors' names
   */
  public Set<String> getCoAuthors(){
    return coAuthors;
  }

  

}
