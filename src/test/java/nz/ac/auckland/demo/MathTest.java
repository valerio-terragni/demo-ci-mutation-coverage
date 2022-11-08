package nz.ac.auckland.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathTest {

  @Test
  public void test_add(){
    assertEquals(5,Math.add(2,3));
  }

  @Test
  public void test_multiply(){
    assertEquals(6,Math.multiply(2,3));
  }

  @Test
  public void test_abs(){
    assertEquals(2,Math.abs(-2));
  }

  @Test
  public void test_abs2(){
    assertEquals(2,Math.abs(2));
  }

  @Test
  public void test_max(){
    assertEquals(5,Math.max(2,5));
  }

  @Test
  public void test_max2(){
    assertEquals(5,Math.max(5,2));
  }
}