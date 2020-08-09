package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Product;

public interface ProductService {
	public void read();

	public void add(Product product);

	public ArrayList<Product> create();

	public void modify(long pos, Product product);

	public void remove(long buscar);

}
