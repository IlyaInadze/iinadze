package ru.job4j.professions;

public class Dantist extends Doctor {
	public int toothNumber;
	public char filling;
	public Dantist(int toothNumber, char filling) {
		this.toothNumber = toothNumber;
		this.filling = filling;
	}
	public int getToothNumber() {
		return this.toothNumber;
	}
	public char getFilling() {
		return this.filling;
    }
}