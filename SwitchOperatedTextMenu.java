import java.util.Scanner;

public class SwitchOperatedTextMenu {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    for (int i = 1; i <=2; i++){
       System.out.println(i + ".Menu Item #" + i);
    }
    System.out.println("0. Quit");

    boolean quit = false;
    int menuItem;

    do {
      System.out.println("Choose Menu Item");
      menuItem = in.nextInt();
      switch(menuItem){
	case 1:
	  System.out.println("You've chossen item #1");
	  break;
	case 2:
	  System.out.println("You've choosen item #2");
	  break;
	case 0:
	  quit = true;
	  break;
	default:
	  System.out.println("Invalid Choice");
      }
    } while (!quit);
    System.out.println("Byee!!");
  }
}
