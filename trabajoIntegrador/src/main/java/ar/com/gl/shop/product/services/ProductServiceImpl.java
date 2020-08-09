package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.model.Product;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public class ProductServiceImpl {
	RepositoryImpl listProduct;
	
	public ArrayList<Product> create(){
		//this.listProduct.getInstance().getListaProductos();
		return this.listProduct.getInstance().getListaProductos();
	}
	
	public ArrayList<Product> read() {
		for(int i = 0; i < listProduct.getInstance().getListaProductos().size(); i++) {
			System.out.println("ID producto: " + listProduct.getInstance().getListaProductos().get(i).getId());
			System.out.println("Nombre: " + listProduct.getInstance().getListaProductos().get(i).getName());
			System.out.println("Descripcion: " + listProduct.getInstance().getListaProductos().get(i).getDescription());
			System.out.println("Precio: " + listProduct.getInstance().getListaProductos().get(i).getPrice());
			System.out.println("Stock: " + listProduct.getInstance().getListaProductos().get(i).getDescription());
			System.out.println("ID categoria: " + listProduct.getInstance().getListaProductos().get(i).getCategory().getId());
		}
		return this.listProduct.getInstance().getListaProductos();
	}
		
	public boolean add(Product elemento) {
		for(Product listProd: listProduct.getInstance().getListaProductos()) {
			if (listProd.getId() == elemento.getId()) {
				System.out.println("ID repetido");
				return false;
			}
		}
		System.out.println(listProduct.getInstance().getListaProductos().add(elemento));
		return listProduct.getInstance().getListaProductos().add(elemento);
	}
	
	public String remove(long id) {
		for(int i = 0; i < listProduct.getInstance().getListaProductos().size(); i++) {
			Product product = listProduct.getInstance().getListaProductos().get(i);
			if (product.getId() == id) {
				listProduct.getInstance().getListaProductos().remove(i);
				return "El elemento con ID: " + id + " ha sido eiminado";
			}
		}
		return "El elemento con ID: " + id + " no se encuentra";
	}
	
	public String update(long idElementoBuscado, Product elemento) {
		boolean encontrado = false;
		for(int i = 0; i < listProduct.getInstance().getListaProductos().size(); i++) {
			Product product = listProduct.getInstance().getListaProductos().get(i);
			if (product.getId() == idElementoBuscado) {
				listProduct.getInstance().getListaProductos().set(i,elemento);
				encontrado = true;
			}
		}
		if(!encontrado) {
			return "El elemento con ID: " + idElementoBuscado + " no se encuentra en la lista";
		}else {
			return "El elemento: " + idElementoBuscado + " ha sido modificado corrctamente";
		}
	}
}
