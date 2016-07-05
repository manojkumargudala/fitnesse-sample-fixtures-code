package com.manoj.setfixture;

import java.util.ArrayList;
import java.util.List;

import com.manoj.app.Items;
import com.manoj.com.SetUpFixtureClass;
import com.manoj.com.VerifySetUpFixtureClass;

import fit.Fixture;

public class MainSetFixtureClass {
  List<Items> itemList = new ArrayList<Items>();

  public MainSetFixtureClass() {
  }

  public void serviceUnderTest(final String serviceName) {
    System.out.println("the parameter is " + serviceName);
  }

  public Fixture addingTheFollowingListToSetUpFixture() {
    return new SetUpFixtureClass(itemList);
  }

  public Fixture verifySetUpFixture() {
    return new VerifySetUpFixtureClass(itemList);
  }

  public Fixture verifySetUpUsingArrayFixture() {
    return new verifySetUpUsingArrayFixture(itemList);

  }

  public Fixture verifySetUpUsingSetFixture() {
    return new VerifySetUpUsingSetFixture(itemList);

  }

}
