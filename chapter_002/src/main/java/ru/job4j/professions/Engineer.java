package ru.job4j.professions;

public class Engineer extends Profession {
	public double experience;
	public long price;
	public String techMessege;
	public Engineer() {
	}
	public Engineer(double experience, long price, String techMessege) {
	this.experience = experience;
	this.price = price;
	this.techMessege = techMessege;
	}
	public double getExperience() {
		return this.experience;
	}
	public long getPrice() {
		return this.price;
	}
	public String getTechMessege() {
		return this.techMessege;
	}
}