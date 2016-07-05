package com.manoj.advanced;

import com.manoj.app.Items;

public class NullReturningOnExceptionItemParser {

  public Items parse(final String s) {
    System.out.println("in items class " + s);
    String[] str = s.split(",", 3);
    Items item = new Items(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
    return item;

  }
}
