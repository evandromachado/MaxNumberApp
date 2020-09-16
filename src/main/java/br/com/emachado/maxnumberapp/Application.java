package br.com.emachado.maxnumberapp;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Evandro
 */
@SpringBootApplication
public class Application {

  private static boolean running;
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    running=true;
  }
  
  public static boolean isRunning()
  {
    return running;
  }
}
