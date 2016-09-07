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
 * The class provides the method that extracts i10-index number from 
 * the given HTML page
 *
 */
public class IndexNumberMatcher {
  
  /**The method that extracts i10-index from the string of given HTML page
   * @param rawHTMLString the string of the whole HTML page
   * @return string of the matched i10-index
   * @throws NoMatchException when no match is found
   */ 
  public int extractIndexNumber(String rawHTMLString) throws NoMatchException {  
    String reForIndexExtraction =
    "i10-index</a></td><td class=\"cit-borderleft cit-data\">.*</td><td "
    + "class=\"cit-borderleft cit-data\">(.*?)</td>";
    Pattern patternObject = Pattern.compile(reForIndexExtraction);
    Matcher matcherObject = patternObject.matcher(rawHTMLString);
    if (matcherObject.find()) {
      return Integer.parseInt(matcherObject.group(1));    
    }
    else{
      throw new NoMatchException("Cannot find index number from HTML.");
    }   
}

}
