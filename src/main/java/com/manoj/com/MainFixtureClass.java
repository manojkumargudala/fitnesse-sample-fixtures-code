package com.manoj.com;

import java.util.ArrayList;
import java.util.List;

import com.manoj.app.Items;

import fit.Fixture;

public class MainFixtureClass {
    List<Items> itemList = new ArrayList<Items>();

    public Fixture addingTheFollowingListToSetUpFixture() {
	return new SetUpFixtureClass(itemList);
    }

    public Fixture verifySetUpFixture() {
	return new VerifySetUpFixtureClass(itemList);
    }
}
