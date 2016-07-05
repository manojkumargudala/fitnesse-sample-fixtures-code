package com.manoj.app;

public class CanIbuy {
 public boolean CanIBuy(final int wallet, final int price) {
    if (wallet >= price) {
      return true;
    }
    return false;
  }
}
