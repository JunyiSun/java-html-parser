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

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * The class that provides methods to generate an output file that contains the 
 * required result
 *
 */
public class FileOutput implements Output{
  
  /**
   * Generate an output file that contains the extracted result of the HTML.
   * @param args The user input(given HTML files, name of the output file) 
   */
  @Override
  public void generateOutput(String[] args) {
    String inputFiles[] = args[0].split(",");
    OutputFormatter formatter = new OutputFormatter();
    formatter.setFormattedOutput(inputFiles);
    String result = formatter.getFormattedOutput();
    PrintWriter writer = null;
    try {
      writer = new PrintWriter(args[1], "UTF-8");
    } catch (FileNotFoundException | UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    writer.println(result);
    writer.close();
  }

}
