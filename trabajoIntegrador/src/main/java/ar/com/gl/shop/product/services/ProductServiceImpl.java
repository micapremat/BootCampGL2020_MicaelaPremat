package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Product;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public class ProductServiceImpl {
	RepositoryImpl listProduct;
	
	public ArrayList<Product> create(){
		this.listProduct = new RepositoryImpl();
		return this.listProduct.getListaProductos();
	}
	
	public void read() {
		for(int i = 0; i < listProduct.getListaProductos().size(); i++) {
			System.out.println("ID producto: " + listProduct.getListaProductos().get(i).getId());
			System.out.println("Nombre: " + listProduct.getListaProductos().get(i).getName());
			System.out.println("Descripcion: " + listProduct.getListaProductos().get(i).getDescription());
			System.out.println("Precio: " + listProduct.getListaProductos().get(i).getPrice());
			System.out.println("Stock: " + listProduct.getListaProductos().get(i).getDescription());
			System.out.println("ID categoria: " + listProduct.getListaProductos().get(i).getCategory().getId());
		}
	}
		
	public void add(Product elemento) {
		listProduct.getListaProductos().add(elemento);
	}
	
	public void remove(long id) {
		for(int i = 0; i < listProduct.getListaProductos().size(); i++) {
			Product product = listProduct.getListaProductos().get(i);
			if (product.getId() == id) {
				listProduct.getListaProductos().remove(i);
			}
		}
	}
	
	public void modify(long idElementoBuscado, Product elemento) {
		boolean encontrado = false;
		for(int i = 0; i < listProduct.getListaProductos().size(); i++) {
			Product product = listProduct.getListaProductos().get(i);
			if (product.getId() == idElementoBuscado) {
				listProduct.getListaProductos().set(i,elemento);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("El elemento no se encuentra en la lista");
		}
	}
}
