import java.util.Scanner;

public class Driver {
  
  public static void main(String args[]) {
    
    System.out.println("Welcome to the Tower, here you will face challenges that will test your strength and intelligence. I wish you the best of luck on your journey to the top");
    System.out.println("");
    System.out.println("Please choose a class from: ");
    System.out.println("1. Wizard");
    System.out.println("2. Knight");
    System.out.println("3. Thief");
    System.out.println("");
    Scanner sc = new Scanner(System.in);
    String classChoice = sc.nextLine();
    if(classChoice.equals("Wizard")) {
      Wizard user = new Wizard();
    }
    else if(classChoice.equals("Knight")) {
      Knight user = new Knight();
    }
    else if(classChoice.equals("Thief")) {
      Thief user = new Thief();
    }
  }
  
}
