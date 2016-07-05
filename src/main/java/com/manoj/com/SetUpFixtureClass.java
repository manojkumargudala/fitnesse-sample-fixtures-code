package com.manoj.com;

import java.util.List;

import com.manoj.advanced.NullReturningOnExceptionItemParser;
import com.manoj.app.Items;

import fitlibrary.SetUpFixture;

public class SetUpFixtureClass extends SetUpFixture {
  List<Items> itemList;

  public SetUpFixtureClass(final List<Items> itemList2) {
    registerParseDelegate(Items.class, new NullReturningOnExceptionItemParser());
    this.itemList = itemList2;
  }

  public void itemNameItemCodeItemValue(final String itemName, final int itemCode, final int itemValue) {
    System.out.println(itemName + "\t" + itemCode + "\t" + itemValue);
    Items item = new Items(itemName, itemCode, itemValue);
    itemList.add(item);
  }

  public void newItemNameItemCodeItemValue(final String itemName, final int itemCode, final int itemValue) {
    System.out.println(itemName + itemCode + itemValue);
    Items item = new Items(itemName, itemCode, itemValue);
    itemList.add(item);
  }

  public void itemNameItemCodeItemValueStockDate(final String itemName, final int itemCode, final int itemValue,
      final Items dt) {
    System.out.println(itemName + itemCode + itemValue);
    Items item = new Items(itemName, itemCode, itemValue);
    itemList.add(item);
  }

}
