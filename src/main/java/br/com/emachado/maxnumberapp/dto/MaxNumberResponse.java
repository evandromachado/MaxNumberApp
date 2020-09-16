package br.com.emachado.maxnumberapp.dto;

/**
 *
 * @author Evandro
 */
public class MaxNumberResponse {

  /**
   * @return the max
   */
  public Number getMax() {
    return max;
  }

  /**
   * @param max the max to set
   */
  public void setMax(Number max) {
    this.max = max;
  }
  private Number max;
}
