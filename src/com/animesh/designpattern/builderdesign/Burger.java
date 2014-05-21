package com.animesh.designpattern.builderdesign;

public abstract class Burger implements Item {

	@Override
	public abstract String name();
	@Override
	public Packing packing() { return new Wrapper();
	}

	@Override
	public abstract price();

}
