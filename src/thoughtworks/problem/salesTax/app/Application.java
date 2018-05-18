package thoughtworks.problem.salesTax.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

import thoughtworks.problem.salesTax.value.Products;


public class Application {
	
	private BigDecimal totalCost=new BigDecimal(0);
	private BigDecimal cost;
	double tx;
	private BigDecimal temp;
	private BigDecimal totalSalestax=new BigDecimal(0);
	private Products product;

	public  void setCost(double cost){
		this.cost=new BigDecimal(Double.toString(cost)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
	
	public void printCost(){
		System.out.println("Cost after applying Sales tax  = " + (this.cost)+"\n");
	}

	public void addSalesTax(double tax){
		tax =new BigDecimal(Math.ceil(tax*20)/20).setScale(2,RoundingMode.HALF_UP).doubleValue();
		temp = new BigDecimal(Double.toString(tax)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		this.totalSalestax= temp.add(this.totalSalestax);
	}
	
	
	public void addCost(double cost){
		temp = new BigDecimal(Double.toString(cost)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		this.totalCost=temp.add(this.totalCost);
	}
	
	public  BigDecimal returnCost(){
		return this.totalCost;
	}
	
	public BigDecimal returnTax(){
		return this.totalSalestax;
	}
	
	public void printSalesTax(){
		System.out.println("Total Sales Tax = "+this.totalSalestax );	
		}
		
		public BigDecimal getSalesTax(){
				return this.totalSalestax;
			}
	
	public void printTotalCost(){
		System.out.println("     Total Cost = "+this.totalCost);
	}
	
	public BigDecimal getTotalCost(){
		return this.totalCost;
	}
	
	public void setProduct(Products product){
		this.product=product;
	}
	
	public Products getProduct(){
		return this.product;
	}
	
	/*private double roundUpSalesTax(double totalSalesTaxForThisProduct) {
		BigDecimal bigDecimalRepresentation = new BigDecimal(
				Double.toString(totalSalesTaxForThisProduct));
		double scaledNumber = bigDecimalRepresentation.setScale(Constants.REQUIRED_DECIMAL_PLACES,
				BigDecimal.ROUND_HALF_EVEN).doubleValue() * 100;
		double resolution = scaledNumber % Constants.NEAREST_N_CENTS;
		if (resolution != 0) {
			scaledNumber += (resolution <= 2) ? -resolution
					: (Constants.NEAREST_N_CENTS - resolution);
		}

		return scaledNumber / 100;
	} */
}
