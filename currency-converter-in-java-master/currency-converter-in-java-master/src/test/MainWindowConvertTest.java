package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import currencyConverter.Currency;
import currencyConverter.MainWindow;

public class MainWindowConvertTest {

	private String devise1;
	private String devise2;
	private ArrayList<Currency> devises;
	private Double montant;

	@BeforeEach
	public void setUp() {
		devise1 = "USD";
		devise2 = "CAD";
		montant = 0.0;
		devises = Currency.init();

	}

	@Test
	public void testDevise1_bonContenu() {
		// Arrange.

		// Act.

		// Assert.
		assertTrue(MainWindow.convert(devise1, devise2, devises, montant) instanceof Double);

	}

	@Test
	public void testDevise1_mauvaisContenu() {
		// Arrange.
		devise1 = "JPY";

		// Act.

		// Assert.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			MainWindow.convert(devise1, devise2, devises, montant);
		});

	}

	@Test
	public void testDevise2_mauvaisContenu() {
		// Arrange.
		devise2 = "JPY";

		// Act.

		// Assert.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			MainWindow.convert(devise1, devise2, devises, montant);
		});

	}

	@Test
	public void testMontant_mauvaisContenu() {
		// Arrange.
		montant = -1.0;

		// Act.

		// Assert.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			MainWindow.convert(devise1, devise2, devises, montant);
		});

	}

	@Test
	public void testDevises_mauvaisContenu() {
		// Arrange.
		devises = new ArrayList<Currency>();

		// Act.

		// Assert.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			MainWindow.convert(devise1, devise2, devises, montant);
		});

	}

}
