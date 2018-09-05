package cinema;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class CinemaBooking {
	public static void printInfo(Room r)
	{
		System.out.println("Cost:" + r.getCost()+", "+"Description:"+r.getDescription());
	}
  public static void main(String[] args) throws ClassNotFoundException, IOException {
	  Map <String, Cinema> cinema = Cinema.getCinema();
	    /*Room r=new SimpleRoom();
	    printInfo(r);
	    r=(Room) new VIP(r);
	    printInfo(r);
	    r=(Room) new ThreeD(r);
	    printInfo(r);*/
    Scanner input = new Scanner(System.in);

    int[] SeatNo = new int[30];
    int Seats;
    int YesOrNo = 1;
    String CustomerName;

    while (YesOrNo == 1) {
      System.out.print("Welcome to Cinema!\nEnterSy your name?\n");
      CustomerName = input.nextLine();

      System.out.printf("Welcome %s! Please have a look at the seating plan.\n\n", CustomerName);

      for (int i = 1; i <= 34; i++) {
        System.out.print("-");
      }
      System.out.println();

      System.out.print("      SEATING PLAN");
      System.out.println();

      for (int j = 1; j <= 34; j++) {
        System.out.print("-");
      }
      System.out.println();

      for (int SeatCounter = 0; SeatCounter < SeatNo.length; SeatCounter++) {
        System.out.printf(SeatCounter + "\t");

        if (SeatCounter == 4) {
          System.out.println();
        } else if (SeatCounter == 9) {
          System.out.println();
        } else if (SeatCounter == 14) {
          System.out.println();
        } else if (SeatCounter == 19) {
          System.out.println();
        } else if (SeatCounter == 24) {
          System.out.println();
        } else if (SeatCounter == 29) {
          System.out.println();
        }
      }
      for (int k = 1; k <= 34; k++) {
        System.out.print("-");
      }
      System.out.println();

      System.out.print("Which seat would you like to book? ");
      Seats = input.nextInt();

      while (Seats < 0 || Seats > 29) {
        System.out.println("Only 0 - 29 seats are allowed to book. Please try again: ");
        Seats = input.nextInt();
      }

      for (int SeatCounter = 0; SeatCounter < SeatNo.length; SeatCounter++) {
        if (SeatCounter == Seats) {
          System.out.println("Seat " + Seats + " is successfully booked.");
          System.out.println(
              "Thanks for booking!\n\nWould you like to make next booking? (Type 1 = Yes; Type 2 = No)");
          YesOrNo = input.nextInt();

          if (YesOrNo == 2) {
            System.out.println("Thank you for using this program.");
          }
        }
      }

      while (YesOrNo != 1 && YesOrNo != 2) {
        System.out.println("Invalid input.");
        System.out.println("Type 1 = Continue booking; Type 2 = Exit the program");
        YesOrNo = input.nextInt();

        if (YesOrNo == 2) {
          System.out.println("Thank you for using this program.");
        }
      }
    }
  }
}
