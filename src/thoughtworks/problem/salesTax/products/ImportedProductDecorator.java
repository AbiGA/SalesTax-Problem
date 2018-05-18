package thoughtworks.problem.salesTax.products;

import thoughtworks.problem.salesTax.constants.Constants;

public class ImportedProductDecorator extends GoodsDecorator {

	private double basicTax;
	
	public ImportedProductDecorator(GoodsTax product, double basicTax) {
		super(product);
		this.basicTax= basicTax;
		
		// TODO Auto-generated constructor stub
	}

	public double calculateSalesTax(int quantity, double cost,
			Boolean isImported) {
		// TODO Auto-generated method stub
		return calculateSalesTaxForImported(quantity,cost,isImported);
	}

	public double calculateSalesTaxForImported(int quantity, double cost,
			Boolean isImported) {
		// TODO Auto-generated method stub
		return ((Constants.IMPORT_DUTY_FOR_IMPORTED+ basicTax)
				 *quantity*cost)/100.00;
	}
	
	
}
