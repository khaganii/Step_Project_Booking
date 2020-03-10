package Libraries;

import Controller.Menu_operations;

public class Main_Menu {
  Menu_operations controller = new Menu_operations();
  public void  showMenu(){
    System.out.println(" ######## SELECT YOUR ITEM ########");
    System.out.println("1. Online-Board");
    System.out.println("2. Show the flight info");
    System.out.println("3. Search and book a flight");
    System.out.println("4. Cancel the booking");
    System.out.println("5. My flights");
    System.out.println("6. Exit");
    controller.switchOperation();
    }
  }
