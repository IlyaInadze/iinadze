package ru.job4j.professions;

public class Doctor extends Profession {
	public double experience;
	public long price;
	public String diagnose;
	public Doctor() {
	}
	public Doctor(double experience, long price, String diagnose) {
	this.experience = experience;
	this.price = price;
	this.diagnose = diagnose;
	}
	public double getExperience() {
		return this.experience;
	}
	public long getPrice() {
		return this.price;
	}
	public String getDiagnose() {
		return this.diagnose;
	}
}