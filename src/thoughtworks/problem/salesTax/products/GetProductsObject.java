package thoughtworks.problem.salesTax.products;

import thoughtworks.problem.salesTax.value.Products;

public class GetProductsObject {

	public GoodsTax getProduct(Products product, Boolean isImported){
		GoodsTax name = null;
		
		if(product.equals(Products.BOOK)){
			Book book = new Book();
			if(isImported)
			    name = new ImportedProductDecorator(book,book.getBasicTax());
			else
				name = new NonImportedProductDecorator(book,book.getBasicTax());
		}
		else if(product.equals(Products.FOOD)){
			Food food = new Food();
			if(isImported)
			    name = new ImportedProductDecorator(food,food.getBasicTax());
			else
				name = new NonImportedProductDecorator(food,food.getBasicTax());
		}
		else if(product.equals(Products.MEDICAL)){
			Medical medical = new Medical();
			if(isImported)
			    name = new ImportedProductDecorator(medical,medical.getBasicTax());
			else
				name = new NonImportedProductDecorator(medical,medical.getBasicTax());
		}
		else {
			Other other = new Other();
			if(isImported)
			    name = new ImportedProductDecorator(other, other.getBasicTax());
			else
				name = new NonImportedProductDecorator(other, other.getBasicTax());
		}
		return name;
	}
}
