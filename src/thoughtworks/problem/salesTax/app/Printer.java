package thoughtworks.problem.salesTax.app;

public class Printer {

	public void printCostNTax(SalesTaxCalculator obj){
	
		obj.getObjectApp().printSalesTax();
		obj.getObjectApp().printTotalCost();
		
	}
}
