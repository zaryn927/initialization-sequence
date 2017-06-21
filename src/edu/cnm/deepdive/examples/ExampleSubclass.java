/**
 * 
 */
package edu.cnm.deepdive.examples;

/**
 * @author Sky Link
 *
 */
public class ExampleSubclass extends ExampleClass {
  
  static {
    System.out.println("static initialization of ExampleSubclass");
  }
  
  {
    System.out.println("instance initialization of ExampleSubclass object");
  }

  /**
   * 
   */
  public ExampleSubclass() {
    this(DEFAULT_VALUE);
    System.out.println("ExampleSubclass()");
  }

  /**
   * @param value
   */
  public ExampleSubclass(int value) {
    super(value);
    System.out.println("ExampleSubclass(int)");
  }
  
  public static void main(String[] args) {
    ExampleSubclass example = new ExampleSubclass();
    System.out.println(example.value);
  }

}
