package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import currencyConverter.Currency;
import currencyConverter.MainWindow;

class MainWindowConvertBoiteBlancheTest {

	private String devise1;
	private String devise2;
	private ArrayList<Currency> devises;
	private Double montant;

	@BeforeEach
	public void setUp() {
		devise1 = "Japanese Yen";
		devise2 = "Chinese Yuan Renminbi";
		montant = 100.0;
		devises = Currency.init();

	}

	@Test
	public void test_couvertureInstructions() {
		// Arrange.

		// Act.

		// Assert.
		assertEquals(5.1, MainWindow.convert(devise1, devise2, devises, montant));
	}
	
	@Test
	public void test_couvertureArcFlot_devise1Mauvaise() {
		// Arrange.
		devise1 = "Not A Devise";
		// Act.

		// Assert.
		assertEquals(0.0, MainWindow.convert(devise1, devise2, devises, montant));
	}

	@Test
	public void test_couvertureArcFlot_devise2Mauvaise() {
		// Arrange.
		devise2 = "Not A Devise";
		// Act.

		// Assert.
		assertEquals(0.0, MainWindow.convert(devise1, devise2, devises, montant));
	}
	
	

}
