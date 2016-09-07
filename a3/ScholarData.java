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
import java.util.TreeSet;

/**
 * The class that stores the required data of a scholar
 *
 */
public class ScholarData {
    // name of the scholar
    private String authorName;
    // total number of citation of the scholar
    private int numberOfCitations;
    // total number of the i10-index after 2009 of the scholar
    private int numberOfIndex;
    // titles of the first 3 publications of the scholar
    private ArrayList<String> titlesOfThreePub;
    // total number of citations from the first 5 publications of the scholar
    private int total5Citations;
    // total number of coAuthors
    private int totalCoAuthors;
    // all names of coAuthors
    private TreeSet<String> coAuthorNames;
    

    /**
     * Constructor of the class, set the data of the scholar
     * @param authorName
     * @param numberOfCitations
     * @param numberOfIndex
     * @param titlesOfThreePub
     * @param total5Citations
     * @param totalCoAuthors
     * @param coAuthorNames
     */
    public ScholarData(String authorName, int numberOfCitations, 
        int numberOfIndex, ArrayList<String> titlesOfThreePub, 
        int total5Citations,int totalCoAuthors, TreeSet<String> coAuthorNames) {
       
      this.authorName = authorName;
      this.numberOfCitations = numberOfCitations;
      this.numberOfIndex = numberOfIndex;
      this.titlesOfThreePub = titlesOfThreePub;
      this.total5Citations = total5Citations;
      this.totalCoAuthors = totalCoAuthors;
      this.coAuthorNames = coAuthorNames;
    }

    /**Get scholar's name
     * @return scholar's name
     */
    public String getAuthorName() {
      return authorName;
    }

    /**
     * Get total number of citation of the scholar
     * @return total number of citation of the scholar
     */
    public int getNumberOfCitations() {
      return numberOfCitations;
    }

    /**
     * Get total number of the i10-index after 2009 of the scholar
     * @return total number of the i10-index after 2009 of the scholar
     */
    public int getNumberOfIndex() {
      return numberOfIndex;
    }

    /**
     * Get titles of the first 3 publications of the scholar
     * @return titles of the first 3 publications of the scholar
     */
    public ArrayList<String> getTitlesOfThreePub() {
      return titlesOfThreePub;
    }

    /** Get total number of citations from the first 
     * 5 publications of the scholar
     * @return total number of citations from the first 5 
     * publications of the scholar
     */
    public int getTotal5Citations() {
      return total5Citations;
    }

    /**
     * Get total number of coAuthors
     * @return total number of coAuthors
     */
    public int getTotalCoAuthors() {
      return totalCoAuthors;
    }

    /**
     * Get all names of coAuthors
     * @return all names of coAuthors
     */
    public TreeSet<String> getCoAuthorNames() {
      return coAuthorNames;
    }

    
    
}
