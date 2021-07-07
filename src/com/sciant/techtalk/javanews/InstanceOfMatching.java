package com.sciant.techtalk.javanews;

// Since Java 14

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import javax.sound.sampled.AudioInputStream;

public class InstanceOfMatching {

  private String name;

  private static InputStream getStream() {
    return new AudioInputStream(null);
  }

  public static void main(String[] args) throws IOException {

    InputStream stream = getStream();

    //Old school way
    if (stream instanceof AudioInputStream) {
      AudioInputStream audioStream = (AudioInputStream) stream;
      audioStream.markSupported();
    } else if (stream instanceof ZipInputStream) {
      ZipInputStream zipStream = (ZipInputStream) stream;
      zipStream.available();
    }

    //The new way
    if (stream instanceof AudioInputStream audioStream) {
      audioStream.markSupported();
    } else if (stream instanceof ZipInputStream zipStream) {
      zipStream.available();
    }
  }

  public boolean oldEquals(Object obj) {
    if (obj instanceof InstanceOfMatching) {
      InstanceOfMatching other = (InstanceOfMatching) obj;
      if (name.equals(other.name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean equals(Object obj){
    return (obj instanceof InstanceOfMatching other && name.equals(other.name));
  }
}