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


import java.util.List;

/**
 * The class that formats the output based on the extracted information
 *
 */
public class OutputFormatter {
  
   /**
   * The string of formatted output
   */
  private String formattedOutput = "";
  
  /**
   * This method formats the output based on the extracted data
   * @param urls The HTML file information that user provided
   */
  public void setFormattedOutput(String[] urls){
    PatternMatcher scholarDataContainer = new PatternMatcher(urls);
    List<ScholarData> authors = scholarDataContainer.getAuthors();
    int allCoAuthorNum = 0;
    int titleIndex = 1;
    for(ScholarData author: authors){
      this.formattedOutput += "-----------------------------------------"
          + "------------------------------"+"\n";
      this.formattedOutput +=
      "1. Name of Author:\n"+"\t" + author.getAuthorName()+"\n"+
      "2. Number of All Citations:\n"+"\t"+ author.getNumberOfCitations()+"\n"+
      "3. Number of i10-index after 2009:\n"+"\t" + author.getNumberOfIndex()+
      "\n"+"4. Title of the first 3 publications:" +"\n";
      for(String title: author.getTitlesOfThreePub()){
        this.formattedOutput +="\t" +titleIndex+ "-   "+ title +"\n";
        titleIndex++;
      }  
      this.formattedOutput += "5. Total paper citation (first 5 papers):" 
      +"\n"+ "\t" + author.getTotal5Citations()+"\n"+"6. Total Co-Authors:"
      +"\n"+ "\t" + author.getTotalCoAuthors()+"\n";
      allCoAuthorNum += author.getTotalCoAuthors();
      titleIndex = 1;
    }
    this.formattedOutput += "\n"+ "---------------------------------------"
        + "--------------------------------"+"\n";
    this.formattedOutput += 
        "7. Co-Author list sorted (Total: " + allCoAuthorNum+ "):";  
    for (String coAuthor: scholarDataContainer.getCoAuthors()){
      this.formattedOutput +="\n" + coAuthor;
    }
  }
  
  /**
   * Get the string of formatted output
   * @return String of formatted output
   */
  public String getFormattedOutput() {   
    return formattedOutput;
  }
  
   
}
