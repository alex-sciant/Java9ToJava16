package com.sciant.techtalk.javanews;

// Since Java 10

import java.util.ArrayList;

public class Var {

  public static void main(String[] args) {

    var num = 10;
    var list = new ArrayList<String>();

    //var something = null;

  }

  //Var is not a reserved word in java due to backward compatibility issues
  void var() {
    var var = "var";
    System.out.println(var);
  }

  //var text = "Some String";

  //void execute(var input) {}

}
