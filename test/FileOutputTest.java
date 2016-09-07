package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import a3.FileOutput;

//test FileOutput class
public class FileOutputTest {
  // test GenerateOutput method for FileOutput
  @Test
  public void testFileOutput() {
    String[] input = {"sample2.html,sample1.html","out.txt"};
    FileOutput out = new FileOutput();
    out.generateOutput(input);
    File f = new File("out.txt");
    assertTrue(f.exists());
    f.delete();
  }

}
