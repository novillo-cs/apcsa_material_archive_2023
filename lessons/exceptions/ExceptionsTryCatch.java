import java.lang.ArithmeticException;

public class ExceptionsTryCatch {

  public static void main(String args[]) {
    try {
      int a = 10;
      int b = 2;

      System.out.println("Value of a = " + a);
      System.out.println("Value of b = " + b);

      int c = a / b;
      System.out.println("a / b = " + c);

      System.out.println("Division has been done.");
    }catch(ArithmeticException e) {
        int c =10/2;
        System.out.println("new division 10 / 2 = " + c);
        System.out.println("Exception Thrown: Invalid division by zero");
        e.printStackTrace();
    }
    finally {
        System.out.println("End");
    }
  }
}