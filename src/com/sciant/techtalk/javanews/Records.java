package com.sciant.techtalk.javanews;

// Since Java 14

public class Records {

  public static void main(String[] args) {

    Vehicle vehicle = new Vehicle("Mercedes", "UX 1238 A95");

    System.out.println(vehicle.brand());
    System.out.println(vehicle.licensePlate());

    System.out.println(vehicle.toString());











    //User user = new User("Alex", "swordfish");
    //System.out.println(user.password());
  }

}


record User (String name, String password) {

  //private String age;  //not allowed

  public String password() {
    return "******";
  }
}
