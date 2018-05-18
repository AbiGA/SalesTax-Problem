package thoughtworks.problem.salesTax.app;

import java.util.HashMap;
import thoughtworks.problem.salesTax.value.Products;
import thoughtworks.problem.salesTax.value.TaxValues;

public class HashMapClass {

	/**
	 * @param args
	 */
	 private HashMap<Boolean, TaxValues> methodMap = new HashMap<Boolean, TaxValues>();


	public void BuildHashMap(final int quantity, final double cost,final SalesTaxCalculator obj, final Products category) {			
		methodMap.put(true, new TaxValues() {
			    public void runCommand() { 
//			    	obj.tax=category.calculateTaxImported(quantity, cost);
			    	obj.totalCost=cost+obj.tax;
			    };
			});

			methodMap.put(false, new TaxValues() {
			    public void runCommand() { 	
	//		    	obj.tax=category.calculateTaxNonImported(quantity, cost);
			    	obj.totalCost=cost+obj.tax;
			    };
			});
			
		
		}
	
	 public HashMap<Boolean, TaxValues> getHashMap(){
    	 return methodMap;
     }
	 
}
