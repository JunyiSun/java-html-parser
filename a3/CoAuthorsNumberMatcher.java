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


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The class provides the method that extracts author's name from 
 * the given HTML page
 *
 */
public class CoAuthorsNumberMatcher {
  
  /**The method that counts numbers of coAuthors
   * from the string of given HTML page
   * @param rawHTMLString the string of the whole HTML page
   * @return the number the matched coAuthors
   */
  public int extractCoAuthorNum(String rawHTMLString) {
    
    String reForCoAuthorNumExtraction =
        "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>(.*?)</a>";
    
    Pattern patternObject = Pattern.compile(reForCoAuthorNumExtraction);
    Matcher matcherObject = patternObject.matcher(rawHTMLString);
    int total = 0;
    while (matcherObject.find()) {
      total = total + 1;
    }    
    return total;
}
}
