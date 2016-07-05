package com.manoj.com;

import com.manoj.app.AddClass;
import com.manoj.app.CanIbuy;

import fitlibrary.DoFixture;

public class FixtureClass extends DoFixture {
  private int value1;

  private int value2;

  private int valuea;

  private int valueb;

  private int result;

  private int wallet;

  private int price;

  public void inputValue1(final int value) {
    this.value1 = value;
  }

  public void inputValueA(final int arg1) {
  }

  public void inputValueB(final int arg1) {
  }

  public void inputValueAAndInputValueB(final int arg1, final int arg2) {
    this.valuea = arg1;
    this.valueb = arg2;
    AddClass addClass = new AddClass();
    this.result = addClass.add(valuea, valueb);
  }

  public int addOfTwoNumbers() {
    return result;

  }

  public void inputValue2(final int value) {
    this.value2 = value;
  }

  public int add() {
    AddClass addClass = new AddClass();
    return addClass.add(value1, value2);
  }

  public void wallet(final int wallet) {
    this.wallet = wallet;
  }

  public void priceOfItem(final int price) {
    this.price = price;
  }

  public boolean CanIBuy() {
    CanIbuy canibuy = new CanIbuy();
    return canibuy.CanIBuy(wallet, price);
  }
}
