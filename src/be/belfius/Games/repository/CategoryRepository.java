package be.belfius.Games.repository;

import java.util.ArrayList;
import java.util.List;
import be.belfius.Games.domain.Category;

public class CategoryRepository {

	private List<Category> categories = new ArrayList<>();
	
	public CategoryRepository() {
		categories.add(new Category(2,"humor"));
		categories.add(new Category(1,"fantasy"));
		categories.add(new Category(3,"language"));
	}
	public List<Category> getAllCats() { 
		return categories;
	}	
	public Category getFirstCat() {
		int first = 1;
		Category foundCat=null;
		for (Category firstCateg : categories) { 
			if (firstCateg.getCatId() == first){
				foundCat = firstCateg;				
				break;
			}
		}
		return foundCat;
	}
	
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
}	
	
