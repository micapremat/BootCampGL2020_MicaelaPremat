package ar.com.gl.shop.product.repository;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.model.Product;
import ar.com.gl.shop.product.model.Stock;

public class RepositoryImpl{
	private ArrayList<Product> listaProductos = new ArrayList<Product>();
	private ArrayList<Category> listaCategorias = new ArrayList<Category>();
	private ArrayList<Stock> listaStock = new ArrayList<Stock>();
	
	private static final RepositoryImpl instance = new RepositoryImpl();
	
	private RepositoryImpl() {
		
	}
	
	public static RepositoryImpl getInstance() {
		return instance;
	}

	public ArrayList<Category> getListaCategorias(){
		return listaCategorias;
	}
	
	public void setListaCategorias(ArrayList<Category> listaCategorias){
		this.listaCategorias = listaCategorias;
	}
	
	public ArrayList<Product> getListaProductos(){
		return listaProductos;
	}
	public void setListaProductos(ArrayList<Product> listaProductos){
		this.listaProductos = listaProductos;
	}
	
	public ArrayList<Stock> getListaStock(){
		return listaStock;
	}
	public void setListaStock(ArrayList<Stock> listaStock){
		this.listaStock = listaStock;
	}
	
	
}
