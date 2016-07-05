package com.manoj.setfixture;

import java.util.List;

import com.manoj.app.Items;

import fitlibrary.SubsetFixture;

public class VerifySetUpUsingSubSetFixture extends SubsetFixture {

    public VerifySetUpUsingSubSetFixture(final List<Items> itemList) {
	setActualCollection(itemList);
    }

}
