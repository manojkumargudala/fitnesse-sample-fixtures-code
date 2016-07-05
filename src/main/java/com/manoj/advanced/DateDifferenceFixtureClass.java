package com.manoj.advanced;

import java.util.Date;

import com.manoj.app.Items;

import fitlibrary.DoFixture;

public class DateDifferenceFixtureClass extends DoFixture {
  public DateDifferenceFixtureClass() {
    registerParseDelegate(Date.class, new NullReturningOnExceptionDateParser("mm/dd/yy"));
    registerParseDelegate(Items.class, new NullReturningOnExceptionItemParser());

  }

  Date dt1;

  Date dt2;

  public void date1(final Date date1) {
    this.dt1 = date1;
  }

  public void thisIsTheOtherMethod(final Items arg1) {
    System.out.println(arg1.getItemCode());
    System.out.println(arg1.getItemName());
    System.out.println(arg1.getItemValue());
  }

  public void date2(final Date date2) {
    this.dt2 = date2;
  }

  public int differenceDates() {
    long diff = dt2.getTime() - dt1.getTime();
    return (int) (diff / (24 * 60 * 60 * 1000));
  }
}
