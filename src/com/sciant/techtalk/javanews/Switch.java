package com.sciant.techtalk.javanews;

// Since Java 12

public class Switch {

  public static void main(String[] args) {

    char count = 5;
    switch (count) {
      case 1 -> System.out.println("One");
      default -> System.out.println("Many");
    }

    switch (count) {
      case 1 -> {
        System.out.println("One");
        System.out.println("Number");
      }
      default -> {
        System.out.println("Many");
        System.out.println("Numbers");
      }
    }

    boolean isValidStoryPoint = switch (count) {
      case 0,1,2,3,5,8,13,20,40,100 -> true;
      default -> false; //Exhaustiveness
    };

    int val = switch (count) {
      case 3 -> {
        System.out.println("It's a three!");
        yield 100;  // since Java 13
      }
      default -> 0;
    };

    count = 1;
    switch (count) {
      case 1 -> {
        break; // end of switch
      }
      case 2 -> {
        return;  // end of method
      }
      default -> System.out.println("Some lame number");
    }
    System.out.println("...");
  }

}
