package thoughtworks.problem.salesTax.app;

import java.util.HashMap;

import thoughtworks.problem.salesTax.value.Products;

public class CategoryLookup {

	private static CategoryLookup instance;
	private static HashMap<String, Products> itemCategoriesMap;

	public static CategoryLookup getInstance() {
		if (instance == null) {
			instance = new CategoryLookup();
		}
		return instance;
	}

	CategoryLookup() {
		itemCategoriesMap = new HashMap<String, Products>();
		itemCategoriesMap.put("book", Products.BOOK);
		itemCategoriesMap.put("books", Products.BOOK);
		itemCategoriesMap.put("chocolate", Products.FOOD);
		itemCategoriesMap.put("chocolates", Products.FOOD);
		itemCategoriesMap.put("music", Products.OTHER);
		itemCategoriesMap.put("perfume", Products.OTHER);
		itemCategoriesMap.put("pills", Products.MEDICAL);

	}


	public Products getCategoryFor(String productDescription) {
		String[] productKeyWords = productDescription.split(" ");
		Products category = Products.OTHER;
		for (int keyWordIndex = 0; keyWordIndex < productKeyWords.length; keyWordIndex++) {
			if (itemCategoriesMap.containsKey(productKeyWords[keyWordIndex])) {
				category = itemCategoriesMap.get(productKeyWords[keyWordIndex]);
			}
		}
		return category;
	}

}
