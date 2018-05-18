package thoughtworks.problem.salesTax.products;


public interface GoodsTax {
	
	public double calculateSalesTax(int quantity, double cost,
			Boolean isImported);
	
}
