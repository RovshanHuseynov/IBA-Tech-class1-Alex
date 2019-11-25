package lesson19.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SNumberTest {

  private SNumber c;

  @Before
  public void setUp() throws Exception {
    this.c = new SNumber();
  }

  @Test
  public void add1() {
    assertEquals("579", c.add("123", "456"));
  }

  @Test
  public void add2() {
    assertEquals("123", c.add("100", "23"));
  }

  @Test
  public void add3() {
    assertEquals("1001", c.add("999", "2"));
  }
}
