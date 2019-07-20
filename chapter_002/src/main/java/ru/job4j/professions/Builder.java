package ru.job4j.professions;

public class Builder extends Engineer {
	public String plan;
	public String budget;
	public Builder(String plan, String budget) {
		this.plan = plan;
		this.budget = budget;
	}
	public String getPlan() {
		return this.plan;
	}
	public String getBudget() {
		return this.budget;
    }
}