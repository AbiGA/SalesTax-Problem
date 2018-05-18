package thoughtworks.problem.salesTax.app;

import java.util.ArrayList;

public class MainApplication {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<InputData> inputData = new FileParser("Inputs/Input.txt")
		.getInputData();
		
		Printer prin = new Printer();
		SalesTaxCalculator obj = new SalesTaxCalculator();		
		
for (InputData data : inputData) {
	System.out.print("Quantity = " + data.getQuantity());
	System.out.print("; Product ="+data.getProduct());
	System.out.print("; Initial Cost = " + data.getCost());
	System.out.println("; Imported = " + data.isImported());
	obj.taxCalc(data.getQuantity(), data.getProduct(), data.getCost(), data.isImported());
}	
//obj.printTaxNCost();
  prin.printCostNTax(obj);
	}
	

}
