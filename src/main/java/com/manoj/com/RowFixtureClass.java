package com.manoj.com;

import java.util.ArrayList;
import java.util.List;

import fit.RowFixture;

public class RowFixtureClass extends RowFixture {
  List<RowFixtureTargetClass> rowFixtureTargetClassList = new ArrayList<RowFixtureTargetClass>();

  @Override
  public Class<?> getTargetClass() {
    return RowFixtureTargetClass.class;
  }

  @Override
  public Object[] query() throws Exception {
    filDetails();
    return rowFixtureTargetClassList.toArray();
  }

  public void filDetails() {
    RowFixtureTargetClass rowFixtureTargetClass = new RowFixtureTargetClass();
    rowFixtureTargetClass.inputValue1 = 2;
    rowFixtureTargetClass.inputValue2 = 4;
    RowFixtureTargetClass rowFixtureTargetClass1 = new RowFixtureTargetClass();
    rowFixtureTargetClass1.inputValue1 = 3;
    rowFixtureTargetClass1.inputValue2 = 9;
    rowFixtureTargetClassList.add(rowFixtureTargetClass);
    rowFixtureTargetClassList.add(rowFixtureTargetClass1);

  }

  public class RowFixtureTargetClass {
    int inputValue1;

    int inputValue2;
  }
}
