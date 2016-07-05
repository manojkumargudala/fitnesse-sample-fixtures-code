package com.manoj.com;

import com.manoj.app.AddClass;

import fit.ColumnFixture;

public class ColumnFixtureClass extends ColumnFixture {

  int inputValue1;

  int inputValue2;

  public int additionValues() {
    AddClass addClass = new AddClass();
    return addClass.add(inputValue1, inputValue2);
  }

  public int additionvalues() {
    AddClass addClass = new AddClass();
    return addClass.add(inputValue1, inputValue2);
  }
}
