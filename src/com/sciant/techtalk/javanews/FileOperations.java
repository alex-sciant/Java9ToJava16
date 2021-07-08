package com.sciant.techtalk.javanews;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Since Java 11

public class FileOperations {

  public static void main(String[] args) throws IOException {

    String content = Files.readString(Paths.get("./resources/sample.txt"));

    System.err.println(content);

    Files.writeString(Paths.get("./resources/output.txt"), content.replace(" ", "*"));

  }
}
