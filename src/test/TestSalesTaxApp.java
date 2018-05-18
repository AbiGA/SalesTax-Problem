package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import thoughtworks.problem.salesTax.app.SalesTaxCalculator;


public class TestSalesTaxApp {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test Case 1
	 * 
	 * INPUT AND OUTPUT
	 * Test Input:
	 * 1 imported box of chocolates at 10.00  
     * 1 imported bottle of perfume at 47.50
	 * 
	 * Expected Output:
	 * 7.65
	 * 65.15
	 * @throws Exception 
	 * 
	 */
	@Test
	public void testSalesTaxAppWithInputOne() throws Exception {
		int quantity[]=new int[]{1,1};
		String product[] = new String[]{"box of chocolates","bottle of perfume"};
		double cost[] = new double[]{10.00,47.50};
		Boolean imported[] = new Boolean[]{true,true};
		SalesTaxCalculator obj = new SalesTaxCalculator();
		int i;
		for(i=0;i<2;i++){
		obj.taxCalc(quantity[i], product[i], cost[i], imported[i]);
		}
		//System.out.println("Expected Sales Tax "+obj.getObjectApp().getSalesTax());
		assertEquals(obj.getObjectApp().getSalesTax(),new BigDecimal(Double.toString(7.65)).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		assertEquals(obj.getObjectApp().getTotalCost(),new BigDecimal(Double.toString(65.15)).setScale(2, BigDecimal.ROUND_HALF_EVEN));
        
	}
	
	/**
	 * Test Case 2 
	 * 
	 * INPUT AND OUTPUT
	 * Test Input:
	 * 1 book at 12.49  
     * 1 music CD at 14.99  
     * 1 chocolate bar at 0.85 
	 * 
	 * Expected Output:
	 * 1.50
	 * 29.83
	 * @throws Exception 
	 * 
	*/ 
	@Test
	public void testSalesTaxWithInputTwo() throws Exception {
		int quantity[]=new int[]{1,1,1};
		String product[] = new String[]{"book","music CD","chocolate"};
		double cost[] = new double[]{12.49,14.99,0.85};
		Boolean imported[] = new Boolean[]{false,false,false};
		SalesTaxCalculator obj = new SalesTaxCalculator();
		int i;
		for(i=0;i<3;i++){
		obj.taxCalc(quantity[i], product[i], cost[i], imported[i]);
		}
		//System.out.println("Expected Sales Tax "+obj.getObjectApp().getSalesTax());
		assertEquals(obj.getObjectApp().getSalesTax(),new BigDecimal(Double.toString(1.50)).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		assertEquals(obj.getObjectApp().getTotalCost(),new BigDecimal(Double.toString(29.83)).setScale(2, BigDecimal.ROUND_HALF_EVEN));
        
	}
	/**
	 * Test Case 3 
	 * 
	 * INPUT AND OUTPUT
	 * Test Input:
	 * 1 imported bottle of perfume at 27.99  
     * 1 bottle of perfume at 18.99  
     * 1 packet of headache pills at 9.75  
     * 1 box of imported chocolates at 11.25 
	 * 
	 * Expected Output:
	 * 6.66
	 * 74.64
	 * @throws Exception 
	 * 
	*/ 
	@Test
	public void testSalesTaxWithInputThree() throws Exception {
		int quantity[]=new int[]{1,1,1,1};
		String product[] = new String[]{"bottle of perfume","bottle of perfume",
				"packet of headache pills","box of chocolates"};
		double cost[] = new double[]{27.99,18.99,9.75,11.25};
		Boolean imported[] = new Boolean[]{true,false,false,true};
		SalesTaxCalculator obj = new SalesTaxCalculator();
		int i;
		for(i=0;i<4;i++){
		obj.taxCalc(quantity[i], product[i], cost[i], imported[i]);
		}
		//System.out.println("Expected Sales Tax "+obj.getObjectApp().getSalesTax());
		assertEquals(obj.getObjectApp().getSalesTax(),new BigDecimal(Double.toString(6.70)).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		assertEquals(obj.getObjectApp().getTotalCost(),new BigDecimal(Double.toString(74.68)).setScale(2, BigDecimal.ROUND_HALF_EVEN));
        
	}
	
}
