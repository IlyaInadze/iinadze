package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
	@Test
	public void whenAddOnePlusOneThenTwo() { 
		Calculator calc = new Calculator();
		calc.add(1, 1);
		double result = calc.getResult();
		double expected = 2;
		assertThat(result, is(expected));
	}
	public void whenSubstractThreeSubOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(3, 1);
		double result = calc.getResult();
		double expected = 2;
		assertThat(result, is(expected));
	}
	public void whenDivFourDivTwoThenTwo() {
		Calculator calc = new Calculator();
		calc.add(4, 2);
		double result = calc.getResult();
		double expected = 2;
		assertThat(result, is(expected));
	}
	public void whenMultipleTwoMultipleTwoThenFour() {
		Calculator calc = new Calculator();
		calc.add(2, 2);
		double result = calc.getResult();
		double expected = 4;
		assertThat(result, is(expected));
	}
}