package Controller;

import Libraries.Main_Menu;
import Service.Online_Board;
import Service.ShowFlightInfo;

import java.util.Scanner;

public class Menu_operations {
  public int enter_number() {
    int number = 0;
    System.out.print("\nEnter a number: \n");
    boolean t = true;
    while (t) {
      try {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        t = false;
      } catch (Exception e) {
        System.out.println("Try again!");
      }
    }
    return number;
  }

  public void switchOperation() {
    Main_Menu main_menu = new Main_Menu();
    switch (enter_number()) {
      case 1:
        Online_Board online_board = new Online_Board();
        System.out.println(online_board.showAllflights());
        main_menu.showMenu();
        break;
      case 2:
        ShowFlightInfo showFlightInfo = new ShowFlightInfo();
        System.out.println("\nPlease, Enter flight ID !");
        System.out.println(showFlightInfo.showInfo(enter_number()));
        System.out.println();
        main_menu.showMenu();
        break;
      case 3:
        System.out.println("item3");
        break;
      case 4:
        System.out.println("item4");
        break;
      case 5:
        System.out.println("item5");
        break;
      case 6:
        System.out.println("\n\n##########  Thanks for choosing us!  ##########\n\n");
        break;
      default:
        System.out.println("\nPlease, Enter correct number!\n");
        switchOperation();
    }
  }
}

