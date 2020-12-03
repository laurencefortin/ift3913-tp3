package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import currencyConverter.Currency;
import currencyConverter.MainWindow;

class CurrencyConvertBoiteBlancheTest {

	private double montant;
	private double valeurEchange;
	@BeforeEach
	public void setUp() {
		montant = 100.0;
		valeurEchange = 0.75;

	}

	@Test
	public void test_couvertureInstructions() {
		// Arrange.

		// Act.

		// Assert.
		assertEquals(75.0, Currency.convert(montant, valeurEchange));
	}

}
