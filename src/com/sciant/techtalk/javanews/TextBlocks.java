package com.sciant.techtalk.javanews;

import jdk.jfr.Description;

// Since Java 13

public class TextBlocks {

  public static void main(String[] args) {
    String html =  """
                    <html>
                      <body>
                        <p>
                          the text
                        </p>
                      </body>
                    </html>""";

    System.err.println(html);

    //String invalid = """ some text """;
  }

  @Description("""
      select * form users 
      when user is null
      """)
  void query() {
    //do some stuff
  }
}
