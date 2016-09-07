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
package exceptions;

/**
 * An error message will be thrown when there is no match of the required data.
 * This is an exception class that generates that error message.
 *
 */
public class NoMatchException extends Exception{
  /**
   * The error message for the exception
   */

  private String message = "";

  /**
   * Constructor for the exception if error message is given
   */

  public NoMatchException(String message) {
    this.message = message;
  }

  /**
   * Constructor for the exception if no error message is given
   */

  public NoMatchException() {}

  /**
   * Getter for the error message
   */

  public String getMessage() {
    return message;
  }

}
