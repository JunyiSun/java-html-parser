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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * The class provides the method that extracts titles of first three papers 
 * from the given HTML page
 *
 */
public class TitlesOfPublicationsMatcher {
  
  /**The method that extracts titles of the first three publications
   * from the string of given HTML page
   * @param rawHTMLString the string of the whole HTML page
   * @return An ArrayList of the matched titles of first three papers
   */
  public ArrayList<String> extractTitles(String rawHTMLString) {
    ArrayList<String> titles = new ArrayList<String>();
    String reForTitleExtraction =
    "class=\"cit-dark-large-link\">(.*?)</a><br>";
    Pattern patternObject = Pattern.compile(reForTitleExtraction);
    Matcher matcherObject = patternObject.matcher(rawHTMLString);
    int i = 1;
    while (matcherObject.find() && i<=3) {
      String title = matcherObject.group(1);   
      titles.add(title);
      i++;
    }
    return titles;
}

}
