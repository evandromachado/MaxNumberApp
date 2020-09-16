package br.com.emachado.maxnumberapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Evandro
 */
public class ApplicationTest {
  
  public ApplicationTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of main method, of class Application.
   */
  @Test
  public void testMain() {
    System.out.println("main");
    String[] args = new String[0];
    Application.main(args);
    
    assertTrue("Application not running", Application.isRunning());
  }
  
}
