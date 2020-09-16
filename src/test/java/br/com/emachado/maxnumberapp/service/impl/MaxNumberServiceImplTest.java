package br.com.emachado.maxnumberapp.service.impl;

import br.com.emachado.maxnumberapp.EmptyListException;
import br.com.emachado.maxnumberapp.dto.MaxNumberRequest;
import br.com.emachado.maxnumberapp.dto.MaxNumberResponse;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Evandro
 */
public class MaxNumberServiceImplTest {
  
  public MaxNumberServiceImplTest() {
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
   * Test of getMaxNumber method, of class MaxNumberServiceImpl.
   */
  @Test
  public void testGetMaxNumber() {
    System.out.println("getMaxNumber");
    MaxNumberRequest request = new MaxNumberRequest();
    request.setList(Arrays.asList(1, 20,3,2.5));
    MaxNumberServiceImpl instance = new MaxNumberServiceImpl();
    MaxNumberResponse result = instance.getMaxNumber(request);
    assertEquals(20, result.getMax());
  }
  
  /**
   * Test of getMaxNumber method, of class MaxNumberServiceImpl.
   */
  @Test
  public void testNullList() {
    System.out.println("testNullList");
    MaxNumberRequest request = new MaxNumberRequest();
    request.setList(null);
    MaxNumberServiceImpl instance = new MaxNumberServiceImpl();
    boolean testSuccess;
    try
    {
      MaxNumberResponse result = instance.getMaxNumber(request);
      testSuccess = false;
    }
    catch(EmptyListException e)
    {
      testSuccess = true;
    }
    assertTrue("test did not failed as expected.", testSuccess);
  }

  /**
   * Test of getMaxNumber method, of class MaxNumberServiceImpl.
   */
  @Test
  public void testEmptyList() {
    System.out.println("testNullList");
    MaxNumberRequest request = new MaxNumberRequest();
    request.setList(new ArrayList<Number>());
    MaxNumberServiceImpl instance = new MaxNumberServiceImpl();
    boolean testSuccess;
    try
    {
      MaxNumberResponse result = instance.getMaxNumber(request);
      testSuccess = false;
    }
    catch(EmptyListException e)
    {
      testSuccess = true;
    }
    assertTrue("test did not failed as expected.", testSuccess);
  }  
}
