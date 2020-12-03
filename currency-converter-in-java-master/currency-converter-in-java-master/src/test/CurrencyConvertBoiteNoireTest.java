package test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import currencyConverter.Currency;
import currencyConverter.MainWindow;

class CurrencyConvertBoiteNoireTest {

	private double montant1;
	private double montant2;
	
	@BeforeEach
	public void setUp() {
		montant1 = 0.0;
		montant2 = 0.0;
	}
	
	@Test
	public void test_bonContenu()
	{
		// Arrange.
		
		
	    // Act.
	

		
		// Assert.	
		assertTrue(Currency.convert(montant1, montant2) instanceof Double);

		
	}
	
	@Test 
	public void testMontant1_mauvaisContenu()
	{
		// Arrange.
		
		
		montant1 = -1.0;

	    // Act.
		
		// Assert.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Currency.convert(montant1, montant2);
		  });
		
	}
	
	
	
	@Test 
	public void testMontant2_mauvaisContenu()
	{
		// Arrange.
		
		
		montant2 = -1.0;


	    // Act.
		
		// Assert.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Currency.convert(montant1, montant2);
		  });
	}
	

}
