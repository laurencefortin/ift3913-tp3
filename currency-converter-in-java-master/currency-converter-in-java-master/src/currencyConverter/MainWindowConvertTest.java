package currencyConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class MainWindowConvertTest {
	
	private String devise1;
	private String devise2;
	private ArrayList<Currency> devises;
	private double montant;
	private MainWindow fenetrePrincipale;
	
	@BeforeEach
	public void setUp() {
		devise1 = "USD";
		devise2 = "USD";
		devises = currencyConverter.Currency.init();
		montant = 100.0;
		fenetrePrincipale = new MainWindow();
	}
	
	@Test
	public void test_bonContenu()
	{
		// Arrange.
		
	    // Act.
		double resultat = MainWindow.convert(devise1, devise2, devises, montant);

		
		// Assert.	
		assertEquals(montant, resultat);

		
	}
	
	@Test 
	public void testDevise1_mauvaisContenu()
	{
		// Arrange.
		
		
		devise1 = "JPY";

	    // Act.
		final double resultat = MainWindow.convert(devise1, devise2, devises, montant);
		// Assert.
		
		assertEquals(0.0, resultat);
		
	}
	
	
	
	@Test 
	public void testDevise2_mauvaisContenu()
	{
		// Arrange.
		
		
		devise2 = "JPY";

	    // Act.
		final double resultat = MainWindow.convert(devise1, devise2, devises, montant);
		// Assert.
		
		assertEquals(0.0, resultat);		
	}
	
	
	
	@Test 
	public void testMontant_mauvaisContenu()
	{
		// Arrange.
		
		
		montant = -1.0;

	    // Act.
		final double resultat = MainWindow.convert(devise1, devise2, devises, montant);
		// Assert.
		
		assertEquals(0.0, resultat);
		
	}
	
	
	
}

