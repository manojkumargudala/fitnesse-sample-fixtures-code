package com.manoj.setfixture;

import java.util.List;

import com.manoj.app.Items;

import fitlibrary.ArrayFixture;

public class verifySetUpUsingArrayFixture extends ArrayFixture {

    List<Items> itemList;

    public verifySetUpUsingArrayFixture(final List<Items> itemList) {
	setActualCollection(itemList);
    }

}
