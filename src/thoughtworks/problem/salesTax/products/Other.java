package thoughtworks.problem.salesTax.products;

import thoughtworks.problem.salesTax.constants.Constants;

public class Other implements GoodsTax,Goods{

	private double basicTax = Constants.SALES_TAX_FOR_DEFAULT;
	public double calculateSalesTax(int quantity, double cost,
			Boolean isImported) {
		// TODO Auto-generated method stub
		return this.calculateSalesTax(quantity, cost, isImported);
	}

	public double getBasicTax() {
		// TODO Auto-generated method stub
		return this.basicTax;
	}

	
}
