package thoughtworks.problem.salesTax.products;

import thoughtworks.problem.salesTax.constants.Constants;

public class NonImportedProductDecorator extends GoodsDecorator {

private double basicTax;
	public NonImportedProductDecorator(GoodsTax product, double basicTax) {
		super(product);
		this.basicTax= basicTax;
		// TODO Auto-generated constructor stub
	}

	public double calculateSalesTaxForNonImported(int quantity, double cost,
			Boolean isImported) {
		// TODO Auto-generated method stub
		return ((Constants.IMPORT_DUTY_FOR_NON_IMPORTED+ this.basicTax)
				 *quantity*cost)/100.00;
	}

	public double calculateSalesTax(int quantity, double cost,
			Boolean isImported) {
		// TODO Auto-generated method stub
		return calculateSalesTaxForNonImported(quantity,cost,isImported);
	}


}
