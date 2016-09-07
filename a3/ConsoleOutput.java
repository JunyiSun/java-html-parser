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

/**
 * The class that provides methods to print output to the console
 *
 */
public class ConsoleOutput implements Output{

  /**
   * Print output to the console.
   * @param args The user input(given HTML files) 
   */
  @Override
  public void generateOutput(String[] args) {
    String inputFiles[] = args[0].split(",");
    OutputFormatter formatter = new OutputFormatter();
    formatter.setFormattedOutput(inputFiles);
    String result = formatter.getFormattedOutput();
    System.out.println(result);
  }

}
