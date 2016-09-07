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


import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * The class provides the method that extracts co authors' names from 
 * the given HTML page
 *
 */
public class CoAuthorsMatcher {
  
  /**The method that extracts coAuthors' names 
   * from the string of given HTML page
   * @param rawHTMLString the string of the whole HTML page
   * @return A TreeSet of the matched coAuthor' names
   */
  public TreeSet<String> extractCoAuthors(String rawHTMLString) {
    TreeSet<String> setOfCoAuthors = new TreeSet<String>();
    
    String reForCoAuthorsExtraction =
    "<a class=\"cit-dark-link\" href=.{1,100}? title=.*?>(.*?)</a>";
    Pattern patternObject = Pattern.compile(reForCoAuthorsExtraction);
    Matcher matcherObject = patternObject.matcher(rawHTMLString);
    while (matcherObject.find()) {
      String coAuthor = matcherObject.group(1);   
      setOfCoAuthors.add(coAuthor);     
    }
    return setOfCoAuthors;
}

}
