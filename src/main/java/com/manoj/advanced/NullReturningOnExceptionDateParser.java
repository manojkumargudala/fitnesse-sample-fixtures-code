package com.manoj.advanced;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NullReturningOnExceptionDateParser {

  String format;

  public NullReturningOnExceptionDateParser(final String string) {
    this.format = string;
  }

  public Date parse(final String s) {
    System.out.println(" i am in parse function" + s);
    SimpleDateFormat formatter = new SimpleDateFormat(format);
    try {

      Date date = formatter.parse(s);
      return date;

    } catch (ParseException e) {
      return null;
    }
  }
}
