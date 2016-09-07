package test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import a3.PatternMatcher;
import a3.ScholarData;


//test PatternMatcherTest class
public class PatternMatcherTest {
  
//test getters
  @Test
  public void testPatternMatcher() {
    String[] input = {"sample2.html","sample1.html"};
    PatternMatcher scholarDataContainer = new PatternMatcher(input);
    List<ScholarData> list = scholarDataContainer.getAuthors();
    Set<String> set = scholarDataContainer.getCoAuthors();
    assertEquals(2, list.size());
    assertEquals(29, set.size());
  }

}
