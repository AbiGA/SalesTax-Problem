package thoughtworks.problem.salesTax.products;

public abstract class GoodsDecorator implements GoodsTax {
  protected GoodsTax decoratedProduct;
  
  public GoodsDecorator(GoodsTax product){
	  this.decoratedProduct = product;
	//  System.out.println(this.decoratedProduct);
  }

public double calculateSalesTax(int quantity, double cost, Boolean isImported, double basicTax) {
	
		// TODO Auto-generated method stub
	
		  return decoratedProduct.calculateSalesTax(quantity, cost, isImported);
		

}

  
}
