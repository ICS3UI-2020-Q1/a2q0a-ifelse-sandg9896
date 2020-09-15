import java.util.Scanner;
/**
 *Lets the user know if they can drive or not
 * @author Gavin Sadhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // define the minimum arguments
    final int MIN_DRIVER_AGE = 16;
   
    // define minimum voting age
    final int VOTING_AGE = 18;

    // prompt the user for their age
    System.out.print("Please enter your age:");

    // get the age from the user
    int age = input.nextInt();    
    if(age>= VOTING_AGE){
      System.out.println("You can vote");
      System.out.println("You can legally drive");
    } else if(age>= MIN_DRIVER_AGE){
      // tell them they can drive
      System.out.print("You can legally get your license");
    } else {
      // not old enough to drive
      System.out.println("Sorry, you can not drive");

      if(age < 18|| age> 60){
        
      }

    }

  }
}
