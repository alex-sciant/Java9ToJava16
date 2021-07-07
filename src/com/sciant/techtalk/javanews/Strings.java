package com.sciant.techtalk.javanews;

// Since Java 11

public class Strings {

  public static void main(String[] args) {
    System.out.println(" L R ".strip().replace(" " ,"-"));  //  "Unicode-aware" evolution of trim()
    System.out.println(" L R ".stripLeading().replace(" " ,"-"));
    System.out.println(" L R ".stripTrailing().replace(" " ,"-"));

    "line1\nline2\nline3".lines().forEach(System.out::println);

    System.out.println("line1\nline2\nline3".indent(4));

    System.out.println("Name: %s".formatted("Neo"));

    System.out.println(" NO ".repeat(3));
  }
}
