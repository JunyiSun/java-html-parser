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
 * The class provides the method that extracts the citation number from 
 * the given HTML page
 *
 */
public class CitationNumberMatcher {
  
  /**The method that extracts citation number from the string of given HTML 
   * page
   * @param rawHTMLString the string of the whole HTML page
   * @return string of the matched total citation number
   * @throws NoMatchException when no match is found
   */
  public int extractCitationNumber(String rawHTMLString) 
      throws NoMatchException {  
    String reForCitationExtraction =
        "Citations</a></td><td class=\"cit-borderleft cit-data\">(.*?)</td>";
        
    Pattern patternObject = Pattern.compile(reForCitationExtraction);
    Matcher matcherObject = patternObject.matcher(rawHTMLString);
    if (matcherObject.find()) {
      return Integer.parseInt(matcherObject.group(1));
    }
    else{
      throw new NoMatchException("Cannot find citation number from HTML.");
    }   
}

}
