package com.manoj.setfixture;

import java.util.ArrayList;
import java.util.List;

import com.manoj.app.Items;
import com.manoj.com.SetUpFixtureClass;
import com.manoj.com.VerifySetUpFixtureClass;

import fit.Fixture;

public class MainSubSetFixtureClass {
    List<Items> itemList = new ArrayList<Items>();

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

    public Fixture verifySetUpUsingSubSetFixture() {
	return new VerifySetUpUsingSubSetFixture(itemList);
    }

}
