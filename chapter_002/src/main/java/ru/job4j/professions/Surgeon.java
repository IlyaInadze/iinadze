package ru.job4j.professions;

public class Surgeon extends Doctor {
	public String sickLeave;
	public double heigh;
	public Surgeon(String sickLeave, double heigh) {
		this.sickLeave = sickLeave;
		this.heigh = heigh;
	}
	public String getSickLeave() {
		return this.sickLeave;
	}
	public double getHeigh() {
		return this.heigh;
    }
}