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

import exceptions.NoMatchException;


/**
 * The class provides the method that extracts author's name from 
 * the given HTML page
 *
 */
public class AuthorNameMatcher{
  

  /**The method that extracts author's name from the string of given HTML page
   * @param rawHTMLString the string of the whole HTML page
   * @return string of the matched author's name
   * @throws NoMatchException when no match is found
   */
  public String extractAuthorsName(String rawHTMLString) 
      throws NoMatchException {  
      String reForAuthorExtraction =
          "<span id=\"cit-name-display\" "
              + "class=\"cit-in-place-nohover\">(.*?)</span>";
      Pattern patternObject = Pattern.compile(reForAuthorExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      if (matcherObject.find()) {
        return  matcherObject.group(1);
      }
      else{
        throw new NoMatchException("Cannot find author's name from HTML.");
      }   
  }
  

}
