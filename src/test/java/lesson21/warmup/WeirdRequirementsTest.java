package lesson21.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeirdRequirementsTest {

  private WeirdRequirements c;

  @Before
  public void setUp() throws Exception {
    this.c = new WeirdRequirements();
  }

  @Test
  public void generate1() {
    assertArrayEquals(new int[]{5,4,3,2,1,0,0,1,2,3,4,5}, c.generate(12));
  }

  @Test
  public void generate2() {
    assertArrayEquals(new int[]{5,4,3,2,1,0,1,2,3,4,5}, c.generate(11));
  }
}
