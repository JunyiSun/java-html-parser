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
 * The class provides the method that counts total citations of first five 
 * from papers the given HTML page
 *
 */
public class FirstFiveCitationMatcher {
  
  /**The method that counts the total number of citations from the first five 
   * publications from the string of given HTML page
   * @param rawHTMLString the string of the whole HTML page
   * @return the number of the matched first five paper's citations
   */
  public int extractFiveCitation(String rawHTMLString) {
    String reForFiveCitationExtraction =
    "<td id=\"col-citedby\"><a class=\"cit-dark-link\" href=.*?>(.*?)</a></td>";
    
    Pattern patternObject = Pattern.compile(reForFiveCitationExtraction);
    Matcher matcherObject = patternObject.matcher(rawHTMLString);
    int i = 1;
    int total = 0;
    while (matcherObject.find() && i<=5) {
      int citation = Integer.parseInt(matcherObject.group(1));
      total = total + citation;
      i++;
    }    
    return total;
}

}
