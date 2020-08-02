package com.onion.calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator cal;

	@BeforeEach
	public void init() {
		cal = new Calculator();
	}

	@Test
	public void add() {
		assertThat(cal.add(6, 3), is(equalTo(9)));
	}

	@Test
	public void subtract() {
		assertThat(cal.subtract(6, 3), is(equalTo(3)));
	}
}
