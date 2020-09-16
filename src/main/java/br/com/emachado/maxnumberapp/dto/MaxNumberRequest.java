package br.com.emachado.maxnumberapp.dto;

import java.util.List;

/**
 *
 * @author Evandro
 */
public class MaxNumberRequest {

  /**
   * @return the list
   */
  public List<Number> getList() {
    return list;
  }

  /**
   * @param list the list to set
   */
  public void setList(List<Number> list) {
    this.list = list;
  }
  private List<Number> list;
}
