package br.com.emachado.maxnumberapp;

/**
 *
 * @author Evandro
 */
public class EmptyListException extends RuntimeException{
  public EmptyListException(String msg)
  {
    super(msg);
  }
}
