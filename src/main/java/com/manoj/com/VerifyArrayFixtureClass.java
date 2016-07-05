package com.manoj.com;

import java.util.List;

import com.manoj.app.Items;

import fitlibrary.ArrayFixture;

public class VerifyArrayFixtureClass extends ArrayFixture {

    public VerifyArrayFixtureClass(final List<Items> itemActualList) {
	setActualCollection(itemActualList);
    }

}
