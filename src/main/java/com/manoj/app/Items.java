package com.manoj.app;

public class Items {

  private final String itemName;

  private final int itemCode;

  private final int itemValue;

  public Items(final String itemName, final int itemCode, final int itemValue) {
    this.itemCode = itemCode;
    this.itemName = itemName;
    this.itemValue = itemValue;
  }

  public String getItemName() {
    return itemName;
  }

  public int getItemCode() {
    return itemCode;
  }

  public int getItemValue() {
    return itemValue;
  }
}
