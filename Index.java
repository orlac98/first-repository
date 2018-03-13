// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-3):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadowing");
    System.out.println("5. Arithmetic");
    System.out.println("6. Reverse");
    System.out.println("7. First Array");
    System.out.println("8. Second Array");
    System.out.println("9. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;
      case 2:
        System.out.println("Switch labs");
        System.out.println();
        FirstSwitch.main(null);
        break;
       case 3:
	    System.out.println("Methods");
	    System.out.println();
	    Methods.main(null);
        break;
      case 4:
        System.out.println("Shaowing lab exercise");
		System.out.println();
		shadow.main(null);
        break;
      case 5:
        System.out.println("Overloading lab excercise");
	    System.out.println();
	  	Arithmetic.main(null);
        break;
       case 6:
	    System.out.println(" Reversing numbers lab excercise");
	   	System.out.println();
	   	Reverse.main(null);
	   	case 7:
	    System.out.println(" First Array lab excercise");
	    System.out.println();
	    FirstArray.main(null);
	    case 8:
		System.out.println(" Second Array lab excercise");
		System.out.println();
	    SecondArray.main(null);
        break;
      	default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}