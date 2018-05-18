package thoughtworks.problem.salesTax.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

import thoughtworks.problem.salesTax.products.GetProductsObject;
import thoughtworks.problem.salesTax.value.Products;


public class SalesTaxCalculator {
	/**
	 * @param args
	 */
	 Application app = new Application();
	// HashMapClass hash = new HashMapClass();
	 float a;
	 double tax,totalCost,temp;
	  CategoryLookup ctl = new CategoryLookup();
	  
  public  void taxCalc(final int quantity, String product, 
		  final double cost, final Boolean isImported) {
			// TODO Auto-generated method stub
			 
		        
		        Products category = ctl.getCategoryFor(product);
		   
		        GetProductsObject prod = new GetProductsObject(); 
		        
		     	  this.tax = prod.getProduct(category,isImported).calculateSalesTax(quantity, cost, isImported);
		     	 temp =new BigDecimal(Math.ceil(this.tax*20)/20).setScale(2,RoundingMode.HALF_UP).doubleValue();
		        this.totalCost=cost+temp;
		        
			//	hash.BuildHashMap(quantity, cost, this, category);
				 
		   //     hash.getHashMap().get(isImported).runCommand();
		
			app.addSalesTax(tax);
			app.setCost(totalCost);
			app.addCost(totalCost);
					
			app.printCost();
			
}


public Application getObjectApp(){
	return app;
}
  
 }
