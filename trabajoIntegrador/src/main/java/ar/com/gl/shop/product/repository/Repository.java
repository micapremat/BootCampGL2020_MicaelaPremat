package ar.com.gl.shop.product.repository;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.model.Product;
import ar.com.gl.shop.product.model.Stock;

public interface Repository {

	public ArrayList<Category> getListaCategorias();

	public void setListaCategorias(ArrayList<Category> listaCategorias);

	public ArrayList<Product> getListaProductos();

	public void setListaProductos(ArrayList<Product> listaProductos);

	public ArrayList<Stock> getListaStock();

	public void setListaStock(ArrayList<Stock> listaStock);
}
