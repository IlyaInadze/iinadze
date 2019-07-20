package ru.job4j.professions;

public class Programmer extends Engineer {
	public String code;
	public String test;
	public Programmer(String code, String test) {
		this.code = code;
		this.test = test;
	}
	public String getCode() {
		return this.code;
	}
	public String getTest() {
		return this.test;
    }
}