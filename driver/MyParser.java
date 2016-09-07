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
package driver;

import a3.ConsoleOutput;
import a3.FileOutput;
import a3.Output;



/**
 * The driver class of the program that reads the HTML page
 *
 */
public class MyParser {

/** 
 * Starting point of the program, it decides which output way to use
* @param args User's input
*/
public static void main(String[] args) {
  if(args.length == 1){
    Output consoleOutput = new ConsoleOutput();
    consoleOutput.generateOutput(args);
  }
  else if (args.length == 2){
    Output fileOutput = new FileOutput();
    fileOutput.generateOutput(args);    
  }
}



}
