package com.manoj.com;

import java.util.List;

import com.manoj.app.Items;

import fit.RowFixture;

public class VerifySetUpFixtureClass extends RowFixture {
    List<Items> itemList;

    public VerifySetUpFixtureClass(final List<Items> itemList) {
	this.itemList = itemList;
    }

    @Override
    public Class<?> getTargetClass() {
	return Items.class;
    }

    @Override
    public Object[] query() throws Exception {
	return itemList.toArray();
    }

}
