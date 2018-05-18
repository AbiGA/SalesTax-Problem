package thoughtworks.problem.salesTax.value;

import thoughtworks.problem.salesTax.constants.Constants;


public enum Products {
	
	BOOK {
		 
/*		@Override
		public double calculateTaxImported(int quantity, double cost) {
			// TODO Auto-generated method stub
			
			  return ((Constants.IMPORT_DUTY_FOR_NON_IMPORTED+
					  Constants.SALES_TAX_FOR_BOOKS)*quantity*cost)/100.00;
		}

		@Override
		public double calculateTaxNonImported(int quantity, double cost) {
			// TODO Auto-generated method stub
			  return ((Constants.IMPORT_DUTY_FOR_NON_IMPORTED+
					  Constants.SALES_TAX_FOR_BOOKS)*quantity*cost)/100.00;
		}
*/
		@Override
		public double returnTaxValue() {
			// TODO Auto-generated method stub
			return Constants.SALES_TAX_FOR_BOOKS;
		}
	},
		
	
	
	FOOD{

/*			@Override
			public double calculateTaxImported(int quantity, double cost) {
				// TODO Auto-generated method stub

					return ((Constants.IMPORT_DUTY_FOR_IMPORTED+
							Constants.SALES_TAX_FOR_FOOD)*quantity*cost)/100.00;

			}

			@Override
			public double calculateTaxNonImported(int quantity, double cost) {
				// TODO Auto-generated method stub
				  return ((Constants.IMPORT_DUTY_FOR_NON_IMPORTED+
						  Constants.SALES_TAX_FOR_FOOD)*quantity*cost)/100.00;
			}
*/
			@Override
			public double returnTaxValue() {
				// TODO Auto-generated method stub
				return Constants.SALES_TAX_FOR_FOOD;
			}
			
		},
		
		
		
		MEDICAL{

	/*		@Override
			public double calculateTaxImported(int quantity, double cost) {
				// TODO Auto-generated method stub
					return ((Constants.IMPORT_DUTY_FOR_IMPORTED+
							Constants.SALES_TAX_FOR_MEDICAL)*quantity*cost)/100.00;
				 
				 
			}

			@Override
			public double calculateTaxNonImported(int quantity, double cost) {
				// TODO Auto-generated method stub
				 return ((Constants.IMPORT_DUTY_FOR_NON_IMPORTED+
						  Constants.SALES_TAX_FOR_MEDICAL)*quantity*cost)/100.00;
			}
    */	
			@Override
			public double returnTaxValue() {
				// TODO Auto-generated method stub
				return Constants.SALES_TAX_FOR_MEDICAL;
			}
			
		},
	
		
		
		
		OTHER{

	/*		@Override
			public double calculateTaxImported(int quantity, double cost) {
				// TODO Auto-generated method stub
				
					return ((Constants.IMPORT_DUTY_FOR_IMPORTED+
							Constants.SALES_TAX_FOR_DEFAULT)*quantity*cost)/100.00;
				
				
			}

			@Override
			public double calculateTaxNonImported(int quantity, double cost) {
				// TODO Auto-generated method stub
				  return ((Constants.IMPORT_DUTY_FOR_NON_IMPORTED+
						  Constants.SALES_TAX_FOR_DEFAULT)*quantity*cost)/100.00;
			}
*/
			@Override
			public double returnTaxValue() {
				// TODO Auto-generated method stub
				return Constants.SALES_TAX_FOR_DEFAULT;
			}
			
		};
	  
	  
//	  public abstract double calculateTaxImported(int quantity, double cost);
//	  public abstract double calculateTaxNonImported(int quantity, double cost);
	  public abstract double returnTaxValue();
}
