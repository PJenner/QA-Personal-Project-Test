package com.bae.personalproject.domain;

public class Starship {

	private String name;
	private String model;
	private int age;

	public Starship(String name, String model, int age) {
		this.name = name;
		this.model = model;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
