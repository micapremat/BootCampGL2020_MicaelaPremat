package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Category;

public interface CategoryService {

	public void read();

	public void add(Category cat);

	public ArrayList<Category> create();

	public void modify(Long pos, Category cat);

	public void remove(Long buscar);

}
