package model;

import java.io.Serializable;

public class User implements Serializable {

	private String id;
	private String name;
	private int age;

	public User() {
		this.id = "";
		this.name = "";
		this.age = 0;
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}