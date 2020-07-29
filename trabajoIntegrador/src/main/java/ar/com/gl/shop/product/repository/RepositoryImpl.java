package ar.com.gl.shop.product.repository;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.model.Product;
import ar.com.gl.shop.product.model.Stock;

public class RepositoryImpl{
	ArrayList<Product> listaProductos = new ArrayList<Product>();
	ArrayList<Category> listaCategorias = new ArrayList<Category>();
	ArrayList<Stock> listaStock = new ArrayList<Stock>();

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
