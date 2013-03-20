package com.fernandocejas.MyApplication.core;

/**
 * Copyright (c) Tuenti Technologies. All rights reserved.
 *
 * @author fcejas
 */
public class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStaticValueInNonStaticMethod() {
		return getLibraryValue();
	}

	public String getLibraryValue() {
		return MyThirdPartyLibrary.getStaticValue();
	}

	public void throwException() {
		throw new RuntimeException();
	}

	public void someVoid() {
		return;
	}

	static class MyThirdPartyLibrary {
		private MyThirdPartyLibrary() {
		}

		public static String getStaticValue() {
			return "hello static";
		}
	}
}
