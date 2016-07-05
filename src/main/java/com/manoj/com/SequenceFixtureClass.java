package com.manoj.com;

import com.manoj.app.AddClass;

import fitlibrary.SequenceFixture;

public class SequenceFixtureClass extends SequenceFixture {
    private int value1;

    private int value2;

    public void inputValue1And2Are(final int value1, final int value2) {
	this.value1 = value1;
	this.value2 = value2;
    }

    public int add() {
	AddClass addClass = new AddClass();
	return addClass.add(value1, value2);
    }
}
