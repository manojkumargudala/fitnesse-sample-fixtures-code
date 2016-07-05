package com.manoj.setfixture;

import java.util.ArrayList;
import java.util.List;

import com.manoj.app.Items;

import fitlibrary.SetFixture;

public class VerifySetUpUsingSetFixture extends SetFixture {
  List<Items> itemList;

  public VerifySetUpUsingSetFixture(final List<Items> itemList) {
    List<ItemActual> actualItemList = new ArrayList<ItemActual>();
    for (Items item : itemList) {
      actualItemList.add(new ItemActual(item.getItemName(), item.getItemCode(), item.getItemValue()));

    }
    setActualCollection(itemList);
  }

}

class ItemActual {
  String itemNameTest;

  int itemCode;

  int itemValue;

  String itemName;

  public ItemActual(final String itemName, final int itemCode, final int itemValue) {
    this.itemCode = itemCode;
    this.itemNameTest = itemName;
    this.itemValue = itemValue;
    this.itemName = itemName;
  }
}
